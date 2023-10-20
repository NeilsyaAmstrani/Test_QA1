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

WebUI.setText(findTestObject('Object Repository/Business Process - Tree View/User dapat menambahkan business process baru dibawahnya/Page_Rize.inc HR Platform/input_Email_email'), 
    'neilsya.am.s.09.0.2@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Business Process - Tree View/User dapat menambahkan business process baru dibawahnya/Page_Rize.inc HR Platform/input_Password_password'), 
    'fzqqY0qJjYTuJiVJRZh4ag==')

WebUI.click(findTestObject('Object Repository/Business Process - Tree View/User dapat menambahkan business process baru dibawahnya/Page_Rize.inc HR Platform/label_Remember me'))

WebUI.click(findTestObject('Object Repository/Business Process - Tree View/User dapat menambahkan business process baru dibawahnya/Page_Rize.inc HR Platform/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Business Process - Tree View/User dapat menambahkan business process baru dibawahnya/Page_Rize.inc HR Platform/span_'))

WebUI.click(findTestObject('Object Repository/Business Process - Tree View/User dapat menambahkan business process baru dibawahnya/Page_Rize.inc HR Platform/h2_Board Automation Business Process'))

WebUI.click(findTestObject('Object Repository/Business Process - Tree View/User dapat menambahkan business process baru dibawahnya/Page_Rize.inc HR Platform/a_Business Process'))

WebUI.click(findTestObject('Object Repository/Business Process - Tree View/User dapat menambahkan business process baru dibawahnya/Page_Rize.inc HR Platform/a_Tree View'))

WebUI.click(findTestObject('Object Repository/Business Process - Tree View/User dapat menambahkan business process baru dibawahnya/Page_Rize.inc HR Platform/button_Change to Parent_addDropdown'))

WebUI.click(findTestObject('Object Repository/Business Process - Tree View/User dapat menambahkan business process baru dibawahnya/Page_Rize.inc HR Platform/a_Add Next'))

WebUI.setText(findTestObject('Object Repository/Business Process - Tree View/User dapat menambahkan business process baru dibawahnya/Page_Rize.inc HR Platform/input_Process Name_name'), 
    'Process BB')

WebUI.click(findTestObject('Object Repository/Business Process - Tree View/User dapat menambahkan business process baru dibawahnya/Page_Rize.inc HR Platform/div_Select Type_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Business Process - Tree View/User dapat menambahkan business process baru dibawahnya/Page_Rize.inc HR Platform/div_Primary Process'))

WebUI.setText(findTestObject('Object Repository/Business Process - Tree View/User dapat menambahkan business process baru dibawahnya/Page_Rize.inc HR Platform/p'), 
    'Decision')

WebUI.setText(findTestObject('Object Repository/Business Process - Tree View/User dapat menambahkan business process baru dibawahnya/Page_Rize.inc HR Platform/p_1'), 
    'Output')

WebUI.setText(findTestObject('Object Repository/Business Process - Tree View/User dapat menambahkan business process baru dibawahnya/Page_Rize.inc HR Platform/p_1_2'), 
    'Financial')

WebUI.setText(findTestObject('Object Repository/Business Process - Tree View/User dapat menambahkan business process baru dibawahnya/Page_Rize.inc HR Platform/p_1_2_3'), 
    'Non Financial')

WebUI.setText(findTestObject('Object Repository/Business Process - Tree View/User dapat menambahkan business process baru dibawahnya/Page_Rize.inc HR Platform/p_1_2_3_4'), 
    'Functional Behaviour Competencies')

WebUI.setText(findTestObject('Object Repository/Business Process - Tree View/User dapat menambahkan business process baru dibawahnya/Page_Rize.inc HR Platform/p_1_2_3_4'), 
    'Technical Behaviour Competencies')

WebUI.click(findTestObject('Business Process - Tree View/User dapat menambahkan business process baru dibawahnya/Page_Rize.inc HR Platform/div_Select Set Competensi'))

WebUI.click(findTestObject('Object Repository/Business Process - Tree View/User dapat menambahkan business process baru dibawahnya/Page_Rize.inc HR Platform/div_pssst x'))

WebUI.click(findTestObject('Object Repository/Business Process - Tree View/User dapat menambahkan business process baru dibawahnya/Page_Rize.inc HR Platform/div_Select Type Competency'))

WebUI.click(findTestObject('Object Repository/Business Process - Tree View/User dapat menambahkan business process baru dibawahnya/Page_Rize.inc HR Platform/div_1x'))

WebUI.click(findTestObject('Object Repository/Business Process - Tree View/User dapat menambahkan business process baru dibawahnya/Page_Rize.inc HR Platform/div_Select Grade Competency'))

WebUI.click(findTestObject('Object Repository/Business Process - Tree View/User dapat menambahkan business process baru dibawahnya/Page_Rize.inc HR Platform/div_s'))

WebUI.setText(findTestObject('Object Repository/Business Process - Tree View/User dapat menambahkan business process baru dibawahnya/Page_Rize.inc HR Platform/p_1_2_3_4_5'), 
    'Functional Competencies')

WebUI.click(findTestObject('Object Repository/Business Process - Tree View/User dapat menambahkan business process baru dibawahnya/Page_Rize.inc HR Platform/a_Submit'))

WebUI.delay(3)

WebUI.closeBrowser()

