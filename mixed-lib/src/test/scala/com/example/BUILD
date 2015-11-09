# java_test(
#     name = "test",
#     srcs = glob(["*.scala"]),
#     size = "small",
#     deps = [
#         "//mixed-lib/src/main/java/com/example:java",
#         "//mixed-lib/src/main/scala/com/example:scala",
#         "//third_party:junit4",
#     ],
# )

# package(default_visibility = ["//visibility:public"])

load("/tools/build_defs/scala/scala", "scala_library")

scala_library(
    name = "scala-test",
    srcs = glob(["*.scala"]),
    deps = [
        "//mixed-lib/src/main/java/com/example:java",
        "//mixed-lib/src/main/scala/com/example:scala",
        # ":mixed-lib-scala",
        "//third_party:junit4",
        "//third_party:specs2",
        "//third_party:scalatest",
    ],
)
