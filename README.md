## Mestrado em Engenharia Informática
## Análise e Teste de Software
### greenmsp - Framework de teste unitário em C--

> open 2 terminals in greenmsp/Tools/i2msp/Tom/

> edit the script script.sh with the correct paths for JAVA_HOME, TOM_HOME and CLASSPATH (add antlr.jar path).

> run the script at both terminals
. script.sh 

>>Terminal 1 - to compile file .i

>>make all

>>cd genI/

>>cp ../exemplos/myTest.i .

>>javac gram/Main.java

>>java gram/Main -assert  < myTest.i > myTest.msp

>>Terminal 2 - to run program C-- in virtual machine MSP ("Mais Simples Possível")

cd genMaqV/

cp ../genI/myTest.msp .

javac maqv/Main.java

java maqv/Main myTest.msp
