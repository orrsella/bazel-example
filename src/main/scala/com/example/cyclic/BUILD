package(default_visibility = ["//visibility:public"])

load("/build_tools/rules/scala/scala", "scala_library")

scala_library(
    name = "scala",
    srcs = ["ScalaCycle.scala"],
    deps = [
        "//src/main/java/com/example/cyclic:java",
    ]
)
