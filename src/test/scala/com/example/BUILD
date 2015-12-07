load("/tools/build_defs/scala/scala-test", "scala_test")

scala_test(
    name = "test",
    srcs = glob(["*.scala"]),
    deps = [
        "//src/main/java/com/example:java",
        "//src/main/scala/com/example:scala",
    ],
)
