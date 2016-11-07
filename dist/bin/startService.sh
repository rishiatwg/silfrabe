#!/bin/bash
cd ..
export NISS_HOME=`pwd`
cd bin
nohup java -jar niss-exbond-boot.jar --spring.config.location=file:$NISS_HOME/conf/application.properties &> ../logs/niss-log.log
echo $! > ../pid/save_pid.txt