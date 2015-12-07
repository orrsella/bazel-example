java_test(
    name = "test-java",
    srcs = glob(["BarTest.java"]),
    size = "small",
    deps = [
        "//mixed-lib/src/main/java/com/example:java",
        "//third_party:junit",
    ],
)

java_import(
    name = "mixed-lib-scala",
    jars = ["//mixed-lib/src/main/scala/com/example:scala"],
)

java_test(
    name = "test-scala",
    srcs = glob(["BazTest.java"]),
    size = "small",
    deps = [
        ":mixed-lib-scala",
        "//third_party:junit",
    ],
)
