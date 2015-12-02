load("/tools/build_defs/scala/scala", "scala_library")

def scala_test(
    name,
    deps=[],
    srcs=[],
    data=[],
    resources=[],
    jvm_flags=[],
    scalacopts=[],
    size="small",
    tags=[]):

  all_deps = deps + [
      "//external:junit",
      "//external:specs2",
      "//external:scalatest",
  ]

  scala_library(
      name = name + "-lib",
      deps = all_deps,
      srcs = srcs,
      data = data,
      resources = resources,
      jvm_flags = jvm_flags,
      scalacopts = scalacopts,
  )

  native.java_import(
      name = name + "-import",
      jars = [":" + name + "-lib"],
  )

  native.java_test(
      name = name + "java-test",
      args = ["testing.junit.RunAllTestsInJar"],
      jvm_flags = jvm_flags + ["-Dtesting.junit.jars=" + name + "-lib_deploy.jar"],
      size = "small",
      runtime_deps = [
          "//tools/src/main/java/testing/junit:java",
          ":" + name + "-import",
      ],
  )
