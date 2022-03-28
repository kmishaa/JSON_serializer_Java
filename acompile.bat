
cls

del per*.bat
del put\*.class

javac -Xlint -d . source/ExClass.java -cp ./lib/*;

echo cls> ExClass.bat
echo.>> ExClass.bat
echo @java -cp ./lib/*; Pack.ExClass>> ExClass.bat
echo.>> ExClass.bat
copy ExClass.bat + lib\pause.txt ExClass.bat



rem @pause>nul
