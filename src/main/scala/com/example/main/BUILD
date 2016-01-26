load("/build_tools/rules/scala/scala", "scala_binary")

scala_binary(
    name = "scala-binary",
    srcs = glob(["*.scala"]),
    main_class = "com.example.main.Main",
    deps = [
        "//src/main/java/com/example:java",
        "//src/main/scala/com/example:scala",
    ],
)
