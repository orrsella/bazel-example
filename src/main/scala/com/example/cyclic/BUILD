package(default_visibility = ["//visibility:public"])

load("/tools/build_defs/scala/scala", "scala_library")

scala_library(
    name = "scala",
    srcs = ["ScalaCycle.scala"],
    deps = [
        "//src/main/java/com/example/cyclic:java",
        "//third_party:scala-library",
    ]
)
