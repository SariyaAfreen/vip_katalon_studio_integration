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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.selectOptionByValue(findTestObject('Object Repository/Amazon searching validation_OR/Page_Amazon.com. Spend less. Smile more/select_All Departments        Arts  Crafts _135c92'), 
    'search-alias=computers-intl-ship', true)

WebUI.setText(findTestObject('Object Repository/Amazon searching validation_OR/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_field-keywords'), 
    'Lenovo')

WebUI.click(findTestObject('Object Repository/Amazon searching validation_OR/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_nav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/Amazon searching validation_OR/Page_Amazon.com  Lenovo/img_Results_s-image'))

WebUI.click(findTestObject('Amazon_Dropdown_OR/Page_Amazon.com Lenovo V15 15.6 FHD Business Laptop Computer, Intel Dual-Core Processor, 16GB DDR4 RAM, 256GB PCIe SSD, WiFi 6, Bluetooth 5.2, RJ-45, Type-C, HDMI, Numeric Keypad, Black, Windows 11 Pro, Befectoy  Electronics/a_5 star                                                                                        4 star                                                                                        3 star'))
Checked=WebUI.verifyElementChecked(findTestObject('Object Repository/Amazon_Dropdown_OR/Page_Amazon.com Lenovo V15 15.6 FHD Business Laptop Computer, Intel Dual-Core Processor, 16GB DDR4 RAM, 256GB PCIe SSD, WiFi 6, Bluetooth 5.2, RJ-45, Type-C, HDMI, Numeric Keypad, Black, Windows 11 Pro, Befectoy  Electronics/a_5 star                                                                                        4 star                                                                                        3 star'), 0)
if(Checked == true)
{
	System.out.println("Element is checked")
}