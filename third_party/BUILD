package(default_visibility = ["//visibility:public"])

java_import(
    name = "junit4",
    jars = [
        "hamcrest/hamcrest-core-1.3.jar",
        "junit/junit-4.11.jar",
    ],
)

java_import(
    name = "specs2",
    jars = [
        "specs2/specs2-core_2.11-3.6.5.jar",
        "specs2/specs2-junit_2.11-3.6.5.jar",
        "specs2/specs2-common_2.11-3.6.5.jar",
        "specs2/specs2-matcher_2.11-3.6.5.jar",
    ],
    deps = [
        ":scalaz",
    ],
)

java_import(
    name = "scalaz",
    jars = [
        "scalaz/scalaz-core_2.11-7.1.5.jar",
        "scalaz/scalaz-concurrent_2.11-7.1.5.jar",
        "scalaz/scalaz-stream_2.11-0.8.jar",
    ],
)



java_import(
    name = "scalatest",
    jars = [
        "scalatest/scalatest_2.11-2.2.4.jar",
    ],
)
