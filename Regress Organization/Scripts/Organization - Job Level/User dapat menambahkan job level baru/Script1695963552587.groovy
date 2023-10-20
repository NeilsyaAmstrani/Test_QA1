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

WebUI.setText(findTestObject('Object Repository/Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/input_Email_email'), 
    'neilsya.am.s.0.902@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/input_Password_password'), 
    'fzqqY0qJjYTuJiVJRZh4ag==')

WebUI.click(findTestObject('Object Repository/Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/label_Remember me'))

WebUI.click(findTestObject('Object Repository/Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/span_'))

WebUI.click(findTestObject('Object Repository/Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/h2_Organization'))

WebUI.click(findTestObject('Object Repository/Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/a_Organizations'))

WebUI.click(findTestObject('Object Repository/Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/a_Job Level'))

WebUI.click(findTestObject('Object Repository/Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/a_Add Job Level'))

WebUI.setText(findTestObject('Object Repository/Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/input_Add New Job Level_name'), 
    'Asistant Manager Intern')

WebUI.setText(findTestObject('Object Repository/Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/input_Description_description'), 
    'Description')

WebUI.click(findTestObject('Object Repository/Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/div_Select level_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/div_1'))

WebUI.click(findTestObject('Object Repository/Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/input_Status_status'))

WebUI.click(findTestObject('Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/div_Select_Type1'))

WebUI.click(findTestObject('Object Repository/Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/div_pssst x'))

WebUI.click(findTestObject('Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/div_Select Type2'))

WebUI.click(findTestObject('Object Repository/Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/div_1x'))

WebUI.click(findTestObject('Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/div_Select_Type3'))

WebUI.click(findTestObject('Object Repository/Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/div_s'))

WebUI.setText(findTestObject('Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/input_core'), 
    'Core Competencies')

WebUI.click(findTestObject('Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/div_Select_Type4'))

WebUI.click(findTestObject('Object Repository/Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/div_pssst x_1_2'))

WebUI.click(findTestObject('Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/div_Select_Type5'))

WebUI.click(findTestObject('Object Repository/Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/div_1x_1_2'))

WebUI.click(findTestObject('Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/div_Select_Type6'))

WebUI.click(findTestObject('Object Repository/Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/div_s_1_2'))

WebUI.setText(findTestObject('Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/input_func'), 
    'Functional Competencies')

WebUI.click(findTestObject('Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/div_Select_Type7'))

WebUI.click(findTestObject('Object Repository/Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/div_pssst x_1'))

WebUI.click(findTestObject('Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/div_Select_Type8'))

WebUI.click(findTestObject('Object Repository/Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/div_1x_1'))

WebUI.click(findTestObject('Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/div_Select_Type9'))

WebUI.click(findTestObject('Object Repository/Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/div_s_1'))

WebUI.setText(findTestObject('Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/input_leader'), 
    'Leader Competencies')

WebUI.click(findTestObject('Object Repository/Organization - Job Level/User dapat menambahkan job level baru/Page_Rize.inc HR Platform/button_Submit'))

WebUI.delay(3)

WebUI.closeBrowser()

