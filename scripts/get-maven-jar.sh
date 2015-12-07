#!/bin/bash

IVY_VERSION="2.4.0"
IVY_JAR="ivy-$IVY_VERSION.jar"

GROUP_ID="org.specs2"
ARTIFACT_ID="specs2-junit_2.11"
VERSION="3.6.6"

if [ ! -f ./$IVY_JAR ]; then
  curl -L -O http://search.maven.org/remotecontent?filepath=org/apache/ivy/ivy/$IVY_VERSION/$IVY_JAR
fi

java -jar $IVY_JAR -dependency $GROUP_ID $ARTIFACT_ID $VERSION -retrieve "./[artifact]-[revision](-[classifier]).[ext]"
rm -f $IVY_JAR
