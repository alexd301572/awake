@ECHO OFF

PUSHD %~dp0
SET WD=%~dp0
SET WD=%WD:~0,-1%

START "" java awake.Awake
