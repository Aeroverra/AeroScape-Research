@echo off
title 508 Client
cd /d "%~dp0"

:: Run the client with the required boot arguments
java -cp "out/production/508 HD;lib/hdlibs.jar" client 1 live live software members english game0

pause