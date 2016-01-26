load("/build_tools/rules/scala/scala", "scala_test")

scala_test(
    name = "test",
    srcs = glob(["*.scala"]),
    deps = [
        "//src/main/java/com/example:java",
        "//src/main/scala/com/example:scala",
    ],
)
