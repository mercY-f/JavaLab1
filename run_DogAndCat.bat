@echo off
set "JAVA_HOME=C:\Program Files\Java\jdk-25.0.2"
cd /d "%~dp0DogAndCat"
call mvnw.cmd javafx:run
