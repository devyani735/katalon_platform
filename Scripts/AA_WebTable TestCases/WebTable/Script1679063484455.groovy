import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.remote.server.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

'Enter your html file location'
WebUI.openBrowser('https://www.techlistic.com/p/demo-selenium-practice.html')

WebUI.maximizeWindow()

WebDriver driver = DriverFactory.getWebDriver()

'The value to be expected from the table'
String ExpectedValue = 'Google'

'Locating the table'
WebElement Table = driver.findElement(By.tagName('table'))

'Locating the rows of the table'
List<WebElement> rows_table = Table.findElements(By.xpath('//*[@id=\'customers\']/tbody/tr'))

'To calculate no of rows  present in the table'
int rows_count = rows_table.size()

'Loop will run for all the rows of the table'
Loop: for (int row = 0; row < rows_count; row++) {
    'To locate columns(cells) of that particular row'
    List<WebElement> Columns_row = rows_table.get(row).findElements(By.xpath('//*[@id=\'customers\']/tbody/tr'))

    'Calculating the number of columns(cells)  present in that particular row'
    int columns_count = Columns_row.size()

    println((('Number of cells present in the Row ' + row) + ' : ') + columns_count)

    'This will give the last cell of the given row'
    for (int column = 0; column < columns_count; column++) {
        'This will retrieve text from each column'
        String celltext = Columns_row.get(column).getText()

        println((((('Cell Value Of the row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)
        'Checking if the text present in Cell is matching with the expected value'
        if (celltext == ExpectedValue) {
            println('Text in row 3 is: ' + Columns_row.get(1).getText())

            'The loop will terminate after gettting the desired output from the table'
            break
        }
    }
}

WebUI.closeBrowser()