# greenmsp

>abrir 2 terminais em greenmsp/Tools/i2msp/Tom/

>utiliar Java 7 (verificar a versão com: java -version)
export JAVA_HOME=`/usr/libexec/java_home -v 1.7`

>exports
export TOM_HOME="/Users/carlosmorais/tom"
export TOM_HOME=${HOME}/tom
export PATH=${PATH}:${TOM_HOME}/bin
export CLASSPATH=${TOM_HOME}/lib/tom-runtime-full.jar:${CLASSPATH}
export CLASSPATH=".:/usr/local/lib/antlr-4.5.1-complete.jar:$CLASSPATH"

>Terminal 1 - para compilar programa C--
make all
cd genI/
javac gram/Main.java
java gram/Main  < test.i > test.msp

>Terminal 2 - para executar programa C-- na máquina virtual MSP
cd genMaqV/
cp ../genI/test.msp .
javac maqv/Main.java
java maqv/Main.java test.msp
