load("/tools/build_defs/scala/scala-test", "scala_test")

scala_test(
    name = "test",
    srcs = glob(["*.scala"]),
    deps = [
        "//mixed-lib/src/main/java/com/example:java",
        "//mixed-lib/src/main/scala/com/example:scala",
    ],
)
