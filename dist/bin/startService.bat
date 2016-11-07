pushd ..
SET NISS_HOME=%cd%
popd
java -jar niss-exbond-boot.jar --spring.config.location=file:%NISS_HOME%\conf\application.properties > ../logs/niss-log.log
for /F "TOKENS=1,2,*" %a in ('tasklist /FI "IMAGENAME eq java.exe"') do set MyPID=%b
echo %MyPID% > ../pid/save_pid.txt