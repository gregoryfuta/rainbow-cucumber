#!/bin/bash

BUILD_SCANNER_JAR=/c/projekty/agents/java-build-agent-4.0.2228.jar
SL_TOKEN=./sl.ftv2-token.txt
WORKSPACE=./veeve
CUSTOM_FILTER_FILE="$WORKSPACE/customFilter.json"

java -jar $BUILD_SCANNER_JAR -scan -tokenfile $SL_TOKEN -buildsessionidfile buildSessionId.txt -workspacepath "$WORKSPACE" -fi "*.jar" -customFilterFile $CUSTOM_FILTER_FILE