java_import(
    name = "mixed-lib-scala",
    jars = ["//mixed-lib/src/main/scala/com/example:scala"],
)

java_test(
    name = "test",
    srcs = glob(["*.java"]),
    size = "small",
    deps = [
        "//mixed-lib/src/main/java/com/example:java",
        ":mixed-lib-scala",
        "//third_party:junit4",
    ],
)
