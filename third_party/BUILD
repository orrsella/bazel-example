package(default_visibility = ["//visibility:public"])

SCALA_VER = "2.11"
SCALA_VER_MINOR = SCALA_VER + ".7"

java_import(
    name = "junit",
    jars = [
        "junit/junit-4.12.jar",
    ],
    deps = [
        ":hamcrest",
    ],
)

java_import(
    name = "hamcrest",
    jars = [
        "hamcrest/hamcrest-core-1.3.jar",
    ],
)

java_import(
    name = "specs2",
    jars = [
        "specs2/specs2-common_" + SCALA_VER + "-3.6.6.jar",
        "specs2/specs2-core_" + SCALA_VER + "-3.6.6.jar",
        "specs2/specs2-junit_" + SCALA_VER + "-3.6.6.jar",
        "specs2/specs2-matcher_" + SCALA_VER + "-3.6.6.jar",
    ],
    deps = [
        ":hamcrest",
        ":kind-projector",
        ":scalaz",
        ":scodec-bits",
    ],
)

java_import(
    name = "scalaz",
    jars = [
        "scalaz/scalaz-concurrent_" + SCALA_VER + "-7.1.4.jar",
        "scalaz/scalaz-core_" + SCALA_VER + "-7.1.4.jar",
        "scalaz/scalaz-effect_" + SCALA_VER + "-7.1.4.jar",
        "scalaz/scalaz-stream_" + SCALA_VER + "-0.8.jar",
    ],
)

java_import(
    name = "scalatest",
    jars = [
        "scalatest/scalatest_" + SCALA_VER + "-2.2.6.jar",
    ],
)

java_import(
    name = "scala-library",
    jars = [
        # "scala-library/scala-library-" + SCALA_VER_MINOR + ".jar",
        # "scala-library/scala-parser-combinators_" + SCALA_VER + "-1.0.4.jar",
        # "scala-library/scala-reflect-" + SCALA_VER_MINOR + ".jar",
        # "scala-library/scala-xml_" + SCALA_VER + "-1.0.5.jar",
        "scala-library/akka-actor_2.11-2.3.10.jar",
        "scala-library/config-1.2.1.jar",
        "scala-library/jline-2.12.1.jar",
        "scala-library/scala-actors-2.11.0.jar",
        "scala-library/scala-actors-migration_2.11-1.1.0.jar",
        "scala-library/scala-compiler.jar",
        "scala-library/scala-continuations-library_2.11-1.0.2.jar",
        "scala-library/scala-continuations-plugin_2.11.7-1.0.2.jar",
        "scala-library/scala-library-2.11.7.jar",
        "scala-library/scala-library.jar",
        "scala-library/scala-parser-combinators_2.11-1.0.4.jar",
        "scala-library/scala-reflect-2.11.7.jar",
        # "scala-library/scala-reflect.jar",
        "scala-library/scala-swing_2.11-1.0.2.jar",
        "scala-library/scala-xml_2.11-1.0.4.jar",
        "scala-library/scala-xml_2.11-1.0.5.jar",
        "scala-library/scalap-2.11.7.jar",
    ],
)

java_import(
    name = "guava",
    jars = [
        "guava/guava-16.0.1.jar",
    ],
)

java_import(
    name = "kind-projector",
    jars = [
        "kind-projector/kind-projector_" + SCALA_VER + "-0.7.1.jar",
    ],
)

java_import(
    name = "scodec-bits",
    jars = [
        "scodec-bits/scodec-bits_" + SCALA_VER + "-1.0.9.jar",
    ],
)
