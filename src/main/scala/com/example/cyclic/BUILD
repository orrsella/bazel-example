package(default_visibility = ["//visibility:public"])

load("/tools/build_defs/scala/scala", "scala_library")

scala_library(
    name = "scala",
    srcs = ["ScalaCycle.scala"],
    deps = [
        "//third_party:scala-library",
        "//src/main/java/com/example/cyclic:java",
    ]
)
