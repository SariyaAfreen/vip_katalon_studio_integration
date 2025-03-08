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

WebUI.openBrowser("")
WebUI.navigateToUrl("http://www.amazon.com")
WebUI.delay(3)
WebUI.maximizeWindow()
String url = WebUI.getUrl()
System.out.println(url)
System.out.println(WebUI.getWindowIndex())
System.out.println(WebUI.getWindowTitle())
WebUI.delay(2)
WebUI.navigateToUrl("http://www.kotak.com")
System.out.println(WebUI.getWindowTitle())
int i = WebUI.getWindowIndex()
System.out.println(i)
System.out.println(WebUI.getPageHeight())
WebUI.delay(2)
WebUI.back()
List<WebElement> allstring = WebUI.getAllLinksOnCurrentPage(false, null)
WebUI.delay(2)
WebUI.forward()
WebUI.delay(2)
WebUI.closeBrowser()