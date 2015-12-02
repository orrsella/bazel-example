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

import org.junit.runners.Suite;
import org.junit.runners.model.RunnerBuilder;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JarSuite extends Suite {
  private static final String JARS_PROPERTY = "testing.junit.jars";
  private static final String JARS_SEPARATOR = ",";

  /**
   * Only called reflectively. Do not use programmatically.
   */
  public JarSuite(Class<?> klass, RunnerBuilder builder) throws Throwable {
    super(builder, klass, getClasses(klass));
  }

  private static Class<?>[] getClasses(Class<?> klass) {
    Set<String> jars = new HashSet<>();
    String propertyValue = System.getProperty(JARS_PROPERTY);
    jars.addAll(Arrays.asList(propertyValue.split(JARS_SEPARATOR)));

    Set<Class<?>> result = new TestSuiteBuilder().addJarsRecursive(jars).create();
    return result.toArray(new Class<?>[result.size()]);
  }
}
