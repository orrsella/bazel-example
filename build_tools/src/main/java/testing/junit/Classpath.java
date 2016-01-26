// Copyright 2014 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package testing.junit;

import com.google.common.base.Preconditions;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * A helper class to find all classes on the current classpath. This is used to automatically create
 * JUnit 3 and 4 test suites.
 */
final class Classpath {
  private static final String CLASS_EXTENSION = ".class";

  /**
   * Finds all classes that live in the given jars.
   */
  static Set<Class<?>> findClasses(Set<String> jars) {
    Set<Class<?>> result = new LinkedHashSet<>();

    for (String entryName : getClassPath()) {
      File classPathEntry = new File(entryName);
      if (classPathEntry.exists()) {
        try {
          if (!classPathEntry.isDirectory() && jars.contains(classPathEntry.getName())) {
            for (String className : findClassesInJar(classPathEntry)) {
              Class<?> clazz = Class.forName(className);
              result.add(clazz);
            }
          }
        } catch (IOException e) {
          throw new AssertionError("Can't read classpath entry "
              + entryName + ": " + e.getMessage());
        } catch (ClassNotFoundException e) {
          throw new AssertionError("Class not found even though it is on the classpath "
              + entryName + ": " + e.getMessage());
        }
      }
    }
    return result;
  }

  /**
   * Returns a set of all classes in the jar that start with the given prefix.
   */
  private static Set<String> findClassesInJar(File jarFile) throws IOException {
    Set<String> classNames = new TreeSet<>();
    try (ZipFile zipFile = new ZipFile(jarFile)) {
      Enumeration<? extends ZipEntry> entries = zipFile.entries();
      while (entries.hasMoreElements()) {
        String entryName = entries.nextElement().getName();
        if (entryName.endsWith(CLASS_EXTENSION)) {
          classNames.add(getClassName(entryName));
        }
      }
    }
    return classNames;
  }

  /**
   * Given the absolute path of a class file, return the class name.
   */
  private static String getClassName(String className) {
    int classNameEnd = className.length() - CLASS_EXTENSION.length();
    return className.substring(0, classNameEnd).replace('/', '.');
  }

  /**
   * Gets the class path from the System Property "java.class.path" and splits
   * it up into the individual elements.
   */
  private static String[] getClassPath() {
    String classPath = System.getProperty("java.class.path");
    String separator = System.getProperty("path.separator", ":");
    return classPath.split(Pattern.quote(separator));
  }
}
