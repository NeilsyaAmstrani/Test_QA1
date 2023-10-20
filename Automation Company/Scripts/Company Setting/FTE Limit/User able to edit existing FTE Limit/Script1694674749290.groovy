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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://dev.okeeman47.site/signin')

WebUI.setText(findTestObject('Object Repository/Company Setting/FTE Limit/User able to edit existing FTE Limit/Page_Rize.inc HR Platform/input_Email_email'), 
    'wlappn2022@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Company Setting/FTE Limit/User able to edit existing FTE Limit/Page_Rize.inc HR Platform/input_Password_password'), 
    'Wq1bEf3Co0t1642TKhZw3w==')

WebUI.click(findTestObject('Object Repository/Company Setting/FTE Limit/User able to edit existing FTE Limit/Page_Rize.inc HR Platform/label_Remember me'))

WebUI.click(findTestObject('Object Repository/Company Setting/FTE Limit/User able to edit existing FTE Limit/Page_Rize.inc HR Platform/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Company Setting/FTE Limit/User able to edit existing FTE Limit/Page_Rize.inc HR Platform/span_'))

WebUI.click(findTestObject('Object Repository/Company Setting/FTE Limit/User able to edit existing FTE Limit/Page_Rize.inc HR Platform/span_Pertamina Patra Niaga'))

WebUI.click(findTestObject('Object Repository/Company Setting/FTE Limit/User able to edit existing FTE Limit/Page_Rize.inc HR Platform/a_Setting'))

WebUI.click(findTestObject('Object Repository/Company Setting/FTE Limit/User able to edit existing FTE Limit/Page_Rize.inc HR Platform/a_FTE Limit'))

WebUI.click(findTestObject('Object Repository/Company Setting/FTE Limit/User able to edit existing FTE Limit/Page_Rize.inc HR Platform/button_Edit Data'))

WebUI.setText(findTestObject('Object Repository/Company Setting/FTE Limit/User able to edit existing FTE Limit/Page_Rize.inc HR Platform/input_Name_name'), 
    'FTE Normal Update')

WebUI.setText(findTestObject('Object Repository/Company Setting/FTE Limit/User able to edit existing FTE Limit/Page_Rize.inc HR Platform/input_Range Start_range_start'), 
    '0.00')

WebUI.setText(findTestObject('Object Repository/Company Setting/FTE Limit/User able to edit existing FTE Limit/Page_Rize.inc HR Platform/input_Range End_range_end'), 
    '0.01')

WebUI.setText(findTestObject('Company Setting/FTE Limit/User able to add new FTE Limit/Page_Rize.inc HR Platform/input_color'), 
    '#31de68')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Company Setting/FTE Limit/User able to edit existing FTE Limit/Page_Rize.inc HR Platform/input_Is Anomaly_is_anomaly'))

WebUI.click(findTestObject('Object Repository/Company Setting/FTE Limit/User able to edit existing FTE Limit/Page_Rize.inc HR Platform/button_Submit'))

WebUI.closeBrowser()

