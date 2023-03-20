package mypack

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class appLogin {

	@Keyword

	public void getlogin() {
		int a=2
		for(int i=0;i<=2;i++) {
			if(a==2) {

				WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_user-name'), 'standard_user')

				WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_password'), 'secret_sauce')

				WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_login-button'))

				WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Open Menu'))

				WebUI.click(findTestObject('Object Repository/Page_Swag Labs/a_Logout'))
			}
			else {
				
				System.out.println("if failed")
			}
		}
	}
}
