#Installer package for POS
#Created by Samuel Magondu.
#Friday 7th July, 2012 15:05

# (c) 2012 Samuel Magondu.
# All rights reserved.


!include "MUI2.nsh"
!include "LogicLib.nsh"

var uninstallerShortcut

var posShortcut

var desktopShortcut

#name of the installer
Name "Vuna Feeds POS 2.0"		

#name of the .exe file
OutFile " Vuna Feeds POS Executable.exe"
		
#the program installation directory
InstallDir "$PROGRAMFILES\Magondu Soft\POS"

#Request application privileges for Windows Vista
RequestExecutionLevel admin

;XPStyle on

#set installer icon
!define MUI_ICON "${NSISDIR}\Contrib\Graphics\Icons\orange-install.ico"

#set uninstaller icon
!define MUI_UNICON "${NSISDIR}\Contrib\Graphics\Icons\orange-uninstall.ico"

;......................................................................................

		#PAGES

;......................................................................................

 !define MUI_ABORTWARNING "Are you sure that you want to stop the installation?"

;--------------------------------

  !insertmacro MUI_PAGE_WELCOME
  ;!insertmacro MUI_PAGE_LICENSE "Core\docs\EULA.rtf"
  !insertmacro MUI_PAGE_DIRECTORY
  !insertmacro MUI_PAGE_INSTFILES
  !insertmacro MUI_PAGE_FINISH

  !insertmacro MUI_UNPAGE_WELCOME
  !insertmacro MUI_UNPAGE_CONFIRM
  !insertmacro MUI_UNPAGE_INSTFILES
  !insertmacro MUI_UNPAGE_FINISH  

;Languages

  !insertmacro MUI_LANGUAGE "English"	


;Version information
   VIAddVersionKey /LANG=${LANG_ENGLISH} "ProductName" "POS 1.0"
   VIAddVersionKey /LANG=${LANG_ENGLISH} "Comments" ""
   VIAddVersionKey /LANG=${LANG_ENGLISH} "CompanyName" "Kelvin Inc"
   VIAddVersionKey /LANG=${LANG_ENGLISH} "LegalTrademarks" "POS is a registered trademark of Kelvin Inc."
   VIAddVersionKey /LANG=${LANG_ENGLISH} "LegalCopyright" "© Copyright 2010 Kelvin Inc. All rights reserved."
   VIAddVersionKey /LANG=${LANG_ENGLISH} "FileDescription" "POS Installer"
   VIAddVersionKey /LANG=${LANG_ENGLISH} "FileVersion" "1.0"

   VIProductVersion "1.0.0.0"


Section  		


	ClearErrors	

	SetOutPath $INSTDIR

	File /r images

	File /r lib

	File /r images

	File pos.jar

	WriteUninstaller $INSTDIR\uninstaller.exe

	CreateDirectory "$SMPROGRAMS\Magondu Soft\POS"

	;CreateDirectory "$INSTDIR\Organs"

	StrCpy $uninstallerShortCut "$SMPROGRAMS\Magondu Soft\POS\Unistaller.lnk"

	StrCpy $posShortcut "$SMPROGRAMS\Magondu Soft\POS\POS.lnk"	
	
	StrCpy $desktopShortcut "$DESKTOP\POS.lnk"	


	CreateShortcut "$uninstallerShortcut" "$INSTDIR\uninstaller.exe"

	CreateShortcut "$posShortcut" "$SYSDIR\javaw.exe" "-jar pos.jar" "$INSTDIR\dist\images\pos.ico"			
	
	CreateShortcut "$desktopShortcut" "$SYSDIR\javaw.exe" "-jar pos.jar" "$INSTDIR\dist\images\pos.ico"		

;______________________________________________________________________________________________

	#Add uninstall information in the Add/Remove Programs

;______________________________________________________________________________________________


	WriteRegStr HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\POS" "DisplayName"		"POS"  
	WriteRegStr HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\POS" "InstallLocation" 	"$INSTDIR" 
	WriteRegStr HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\POS" "DisplayVersion"  	"1.0" 
	WriteRegStr HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\POS" "Publisher"	 	"Kelvin Inc" 
	WriteRegStr HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\POS" "HelpLink"        	"" 
SectionEnd



;...............................................................................

			#APPLICATION UNINSTALL SECTION

;...............................................................................

#Defining what the uninstaller will do
Section "Uninstall"
	#delete the contents of the installation folder

	RMDir /r $INSTDIR

	;RMDir /r $SMPROGRAMS\Magondu Soft\POS	

	delete $DESKTOP\POS.lnk

	DeleteRegKey HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\POS"	

SectionEnd	


;......................................................................

	#FUNCTIONS USED DURING THE UNINSTALLATION PROCESS.

;......................................................................

#prompts user to confirm delete
Function un.onInit
    MessageBox MB_YESNO "Are you sure you want to uninstall 'POS'?" IDYES NoAbort
      	 Abort ; causes uninstaller to quit.
    NoAbort:
FunctionEnd


;..........................................................................

		#FUNCTIONS USED DURING INSTALLATION		

;..........................................................................

Function .onInit

	System::Call 'kernel32::CreateMutexA(i 0, i 0, t "myMutex") i .r1 ?e'
 	Pop $R0
 
 	StrCmp $R0 0 +3
   	MessageBox MB_OK|MB_ICONEXCLAMATION "An instance of the installer is already running."
   	Abort

	
	#Check if JRE 1.7.0 is installed
	#ReadRegStr $JRE HKLM "SOFTWARE\JavaSoft\Java Runtime Environment" "CurrentVersion"

	#${If} $JRE != "1.7"
		#MessageBox MB_OK|MB_ICONINFORMATION "Java Runtime Environment 1.7 or higher must be \
	     	#$\n installed before the installation of Comrade Utilities Suite 0.9.0.\
	     	#$\n Consult your user's guide for more details."
		#Quit
	#${EndIf}	
			
	
	FunctionEnd	