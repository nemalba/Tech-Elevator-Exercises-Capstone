@echo off

SET IntellijPath=C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.3.2\bin\idea64.exe
 
echo Adding file entries
@reg add "HKEY_CLASSES_ROOT\*\shell\IntelliJ" /t REG_SZ /v "" /d "Open in IntelliJ"   /f
@reg add "HKEY_CLASSES_ROOT\*\shell\IntelliJ" /t REG_EXPAND_SZ /v "Icon" /d "%IntellijPath%,0" /f
@reg add "HKEY_CLASSES_ROOT\*\shell\IntelliJ\command" /t REG_SZ /v "" /d "%IntellijPath% \"%%1\"" /f
 
echo Adding within a folder entries
@reg add "HKEY_CLASSES_ROOT\Directory\Background\shell\IntelliJ" /t REG_SZ /v "" /d "Open with IntelliJ"   /f
@reg add "HKEY_CLASSES_ROOT\Directory\Background\shell\IntelliJ" /t REG_EXPAND_SZ /v "Icon" /d "%IntellijPath%,0" /f
@reg add "HKEY_CLASSES_ROOT\Directory\Background\shell\IntelliJ\command" /t REG_SZ /v "" /d "%IntellijPath% \"%%V\"" /f

echo Adding folder entries
@reg add "HKEY_CLASSES_ROOT\Directory\shell\IntelliJ" /t REG_SZ /v "" /d "Open with IntelliJ"   /f
@reg add "HKEY_CLASSES_ROOT\Directory\shell\IntelliJ" /t REG_EXPAND_SZ /v "Icon" /d "%IntellijPath%,0" /f
@reg add "HKEY_CLASSES_ROOT\Directory\shell\IntelliJ\command" /t REG_SZ /v "" /d "%IntellijPath% \"%%1\"" /f

pause