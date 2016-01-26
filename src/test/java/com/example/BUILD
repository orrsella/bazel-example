java_test(
    name = "test-java",
    srcs = glob(["BarTest.java"]),
    size = "small",
    deps = [
        "//src/main/java/com/example:java",
        "//third_party:junit",
    ],
)

java_test(
    name = "test-scala",
    srcs = glob(["BazTest.java"]),
    size = "small",
    deps = [
        "//src/main/scala/com/example:scala_deploy.jar",
        "//third_party:junit",
        "//third_party:scala-library",
    ],
)
