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

WebUI.setText(findTestObject('Organization - Structure View/User dapat melihat fokus posisi pada structure terpilih/Page_Rize.inc HR Platform/input_Email_email'), 
    'neilsya.am.s.0.902@gmail.com')

WebUI.setEncryptedText(findTestObject('Organization - Structure View/User dapat melihat fokus posisi pada structure terpilih/Page_Rize.inc HR Platform/input_passowrd_password'), 
    'fzqqY0qJjYTuJiVJRZh4ag==')

WebUI.click(findTestObject('Object Repository/Organization - Structure View/User dapat melihat fokus posisi pada structure terpilih/Page_Rize.inc HR Platform/label_Remember me'))

WebUI.click(findTestObject('Object Repository/Organization - Structure View/User dapat melihat fokus posisi pada structure terpilih/Page_Rize.inc HR Platform/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Organization - Structure View/User dapat melihat fokus posisi pada structure terpilih/Page_Rize.inc HR Platform/span_'))

WebUI.click(findTestObject('Object Repository/Organization - Structure View/User dapat melihat fokus posisi pada structure terpilih/Page_Rize.inc HR Platform/h2_Organization'))

WebUI.click(findTestObject('Object Repository/Organization - Structure View/User dapat melihat fokus posisi pada structure terpilih/Page_Rize.inc HR Platform/a_Organizations'))

WebUI.click(findTestObject('Object Repository/Organization - Structure View/User dapat melihat fokus posisi pada structure terpilih/Page_Rize.inc HR Platform/a_Structure View'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Organization - Structure View/User dapat melihat fokus posisi pada structure terpilih/Page_Rize.inc HR Platform/select_Choose PositionManagerAsisten Manage_f72c7c'), 
    'e3002e08-7052-4f01-b058-181d1c6de9d1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Organization - Structure View/User dapat melihat fokus posisi pada structure terpilih/Page_Rize.inc HR Platform/select_Choose PositionManagerAsisten Manage_f72c7c'), 
    '6b9a06a6-9724-430a-b137-1bad53e48af1', true)

WebUI.delay(3)

WebUI.closeBrowser()

