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

WebUI.setText(findTestObject('Object Repository/User melakukan penyesuaian Password dengan menginputkan (Old Password) yang salah/Page_Rize.inc HR Platform/input_Email_email'), 
    'neilsyaams0902@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/User melakukan penyesuaian Password dengan menginputkan (Old Password) yang salah/Page_Rize.inc HR Platform/input_Password_password'), 
    'fzqqY0qJjYTuJiVJRZh4ag==')

WebUI.click(findTestObject('Object Repository/User melakukan penyesuaian Password dengan menginputkan (Old Password) yang salah/Page_Rize.inc HR Platform/label_Remember me'))

WebUI.click(findTestObject('Object Repository/User melakukan penyesuaian Password dengan menginputkan (Old Password) yang salah/Page_Rize.inc HR Platform/button_Sign in'))

WebUI.click(findTestObject('Object Repository/User melakukan penyesuaian Password dengan menginputkan (Old Password) yang salah/Page_Rize.inc HR Platform/span_'))

WebUI.click(findTestObject('Object Repository/User melakukan penyesuaian Password dengan menginputkan (Old Password) yang salah/Page_Rize.inc HR Platform/a_Neilsya Amstrani Maulidatul Hijriyah'))

WebUI.click(findTestObject('Object Repository/User melakukan penyesuaian Password dengan menginputkan (Old Password) yang salah/Page_Rize.inc HR Platform/a_Profile'))

WebUI.setEncryptedText(findTestObject('Object Repository/User melakukan penyesuaian Password dengan menginputkan (Old Password) yang salah/Page_Rize.inc HR Platform/input_Old Password_old_password'), 
    'fzqqY0qJjYRSEZPcoZS/4g==')

WebUI.setEncryptedText(findTestObject('Object Repository/User melakukan penyesuaian Password dengan menginputkan (Old Password) yang salah/Page_Rize.inc HR Platform/input_New Password_new_password'), 
    'fzqqY0qJjYTuJiVJRZh4ag==')

WebUI.setEncryptedText(findTestObject('Object Repository/User melakukan penyesuaian Password dengan menginputkan (Old Password) yang salah/Page_Rize.inc HR Platform/input_Retype Password_new_password2'), 
    'fzqqY0qJjYTuJiVJRZh4ag==')

WebUI.click(findTestObject('Object Repository/User melakukan penyesuaian Password dengan menginputkan (Old Password) yang salah/Page_Rize.inc HR Platform/a_Submit'))

WebUI.delay(3)

WebUI.closeBrowser()

