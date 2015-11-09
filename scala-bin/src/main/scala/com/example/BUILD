load("/tools/build_defs/scala/scala", "scala_binary")

scala_binary(
    name = "scala-bin",
    srcs = glob(["*.scala"]),
    main_class = "com.example.Main",
    deps = [
        "//third_party:scala-library",
        "//mixed-lib/src/main/java/com/example:java",
        "//mixed-lib/src/main/scala/com/example:scala",
    ]
)
