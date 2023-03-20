import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.seleniumhq.jetty9.util.security.Password as Password
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/KatalonDemoSite Obj/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.waitForElementPresent(findTestObject('Object Repository/KatalonDemoSite Obj/Page_CURA Healthcare Service/input_Password_password'), 
   3)

WebUI.setText(findTestObject('Object Repository/KatalonDemoSite Obj/Page_CURA Healthcare Service/input_Username_username'), 
    GlobalVariable.Username)

WebUI.setText(findTestObject('Object Repository/KatalonDemoSite Obj/Page_CURA Healthcare Service/input_Password_password'), 
    GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/KatalonDemoSite Obj/Page_CURA Healthcare Service/button_Login'))

WebUI.closeBrowser()

