java_test(
    name = "test-java",
    srcs = glob(["BarTest.java"]),
    size = "small",
    deps = [
        "//src/main/java/com/example:java",
        "//third_party:junit",
    ],
)

java_import(
    name = "scala-import",
    jars = ["//src/main/scala/com/example:scala"],
)

java_test(
    name = "test-scala",
    srcs = glob(["BazTest.java"]),
    size = "small",
    deps = [
        ":scala-import",
        "//third_party:junit",
    ],
)
