#!/bin/bash

BUILD_SCANNER_JAR=/c/projekty/agents/java-build-agent-4.0.2228.jar

java -jar $BUILD_SCANNER_JAR -pom -configfile sl.pom.config.json -workspacepath .