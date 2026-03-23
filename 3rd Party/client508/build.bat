@echo off
setlocal
cd /d "%~dp0"
javac -deprecation -d "out/production/508 HD" -cp "lib/hdlibs.jar" -sourcepath src src/*.java
pause
