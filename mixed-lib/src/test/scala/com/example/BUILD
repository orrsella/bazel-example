load("/tools/build_defs/scala/scala", "scala_library")

scala_library(
    name = "scala-test-lib",
    srcs = glob(["*.scala"]),
    deps = [
        "//mixed-lib/src/main/java/com/example:java",
        "//mixed-lib/src/main/scala/com/example:scala",
        "//third_party:junit4",
        "//third_party:specs2",
        "//third_party:scalatest",
    ],
)

java_import(
    name = "scala-test-import",
    jars = [":scala-test-lib"],
)

java_test(
    name = "scala-test",
    srcs = glob(["*.java"]),
    size = "small",
    deps = [
        ":scala-test-import",
    ],
)
