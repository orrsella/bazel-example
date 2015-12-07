load("/tools/build_defs/scala/scala", "scala_binary")

scala_binary(
    name = "scala-binary",
    srcs = glob(["*.scala"]),
    main_class = "com.example.main.Main",
    deps = [
        "//third_party:scala-library",
        "//src/main/java/com/example:java",
        "//src/main/scala/com/example:scala",
    ],
)
