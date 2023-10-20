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

WebUI.setText(findTestObject('Object Repository/Business Process - Tree View/User can Edit business process melalui halaman Tree View/Page_Rize.inc HR Platform/input_Email_email'), 
    'neilsya.am.s.09.0.2@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Business Process - Tree View/User can Edit business process melalui halaman Tree View/Page_Rize.inc HR Platform/input_Password_password'), 
    'fzqqY0qJjYTuJiVJRZh4ag==')

WebUI.click(findTestObject('Object Repository/Business Process - Tree View/User can Edit business process melalui halaman Tree View/Page_Rize.inc HR Platform/label_Remember me'))

WebUI.click(findTestObject('Object Repository/Business Process - Tree View/User can Edit business process melalui halaman Tree View/Page_Rize.inc HR Platform/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Business Process - Tree View/User can Edit business process melalui halaman Tree View/Page_Rize.inc HR Platform/span_'))

WebUI.click(findTestObject('Business Process - Tree View/User can Edit business process melalui halaman Tree View/Page_Rize.inc HR Platform/h2_Board Automation Business Process'))

WebUI.click(findTestObject('Object Repository/Business Process - Tree View/User can Edit business process melalui halaman Tree View/Page_Rize.inc HR Platform/a_Business Process'))

WebUI.click(findTestObject('Object Repository/Business Process - Tree View/User can Edit business process melalui halaman Tree View/Page_Rize.inc HR Platform/a_Tree View'))

WebUI.click(findTestObject('Object Repository/Business Process - Tree View/User can Edit business process melalui halaman Tree View/Page_Rize.inc HR Platform/a_Edit Data'))

WebUI.setText(findTestObject('Object Repository/Business Process - Tree View/User can Edit business process melalui halaman Tree View/Page_Rize.inc HR Platform/input_Process Name_name'), 
    'LPG Operation Update update update')

WebUI.setText(findTestObject('Object Repository/Business Process - Tree View/User can Edit business process melalui halaman Tree View/Page_Rize.inc HR Platform/p_Decision Update'), 
    'Decision Update')

WebUI.setText(findTestObject('Object Repository/Business Process - Tree View/User can Edit business process melalui halaman Tree View/Page_Rize.inc HR Platform/p_Objective Update'), 
    'Objective Update')

WebUI.setText(findTestObject('Object Repository/Business Process - Tree View/User can Edit business process melalui halaman Tree View/Page_Rize.inc HR Platform/p_Output Update'), 
    'Output Update')

WebUI.setText(findTestObject('Object Repository/Business Process - Tree View/User can Edit business process melalui halaman Tree View/Page_Rize.inc HR Platform/p_Financial Type Update'), 
    'Financial Type Update')

WebUI.setText(findTestObject('Object Repository/Business Process - Tree View/User can Edit business process melalui halaman Tree View/Page_Rize.inc HR Platform/p_Non Financial Type Update'), 
    'Non Financial Type Update')

WebUI.setText(findTestObject('Object Repository/Business Process - Tree View/User can Edit business process melalui halaman Tree View/Page_Rize.inc HR Platform/p_Funvtional Behaviur Update'), 
    'Funvtional Behaviur Update')

WebUI.setText(findTestObject('Object Repository/Business Process - Tree View/User can Edit business process melalui halaman Tree View/Page_Rize.inc HR Platform/p_Technical Behaviour Update'), 
    'Technical Behaviour Update')

WebUI.setText(findTestObject('Object Repository/Business Process - Tree View/User can Edit business process melalui halaman Tree View/Page_Rize.inc HR Platform/p_Functional Competencies Update'), 
    'Functional Competencies Update')

WebUI.click(findTestObject('Business Process - Tree View/User can Edit business process melalui halaman Tree View/Page_Rize.inc HR Platform/div_Select Set Competency'))

WebUI.click(findTestObject('Business Process - Tree View/User can Edit business process melalui halaman Tree View/Page_Rize.inc HR Platform/div_pssst x'))

WebUI.click(findTestObject('Business Process - Tree View/User can Edit business process melalui halaman Tree View/Page_Rize.inc HR Platform/div_Select Type Competency'))

WebUI.click(findTestObject('Business Process - Tree View/User can Edit business process melalui halaman Tree View/Page_Rize.inc HR Platform/div_1x'))

WebUI.click(findTestObject('Business Process - Tree View/User can Edit business process melalui halaman Tree View/Page_Rize.inc HR Platform/div_Select Grade Competency'))

WebUI.click(findTestObject('Business Process - Tree View/User can Edit business process melalui halaman Tree View/Page_Rize.inc HR Platform/div_s'))

WebUI.setText(findTestObject('Object Repository/Business Process - Tree View/User can Edit business process melalui halaman Tree View/Page_Rize.inc HR Platform/input_Standar Waktu Kerja_form-control form_a50bc9'), 
    'Meeting Update update')

WebUI.setText(findTestObject('Object Repository/Business Process - Tree View/User can Edit business process melalui halaman Tree View/Page_Rize.inc HR Platform/input_Standar Waktu Kerja_form-control form_a50bc9_1'), 
    '23')

WebUI.click(findTestObject('Business Process - Tree View/User can Edit business process melalui halaman Tree View/Page_Rize.inc HR Platform/a_Submit'))

WebUI.delay(23)

