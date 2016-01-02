#!/bin/bash

export JAVA_HOME=`/usr/libexec/java_home -v 1.7`
export TOM_HOME="/Users/carlosmorais/tom"
export TOM_HOME=${HOME}/tom
export PATH=${PATH}:${TOM_HOME}/bin
export CLASSPATH=${TOM_HOME}/lib/tom-runtime-full.jar:${CLASSPATH}
export CLASSPATH=".:/usr/local/lib/antlr-4.5.1-complete.jar:$CLASSPATH"