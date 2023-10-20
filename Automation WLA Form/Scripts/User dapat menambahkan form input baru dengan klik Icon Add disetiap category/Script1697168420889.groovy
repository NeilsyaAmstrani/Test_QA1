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

WebUI.navigateToUrl('https://dev.okeeman47.site/workload-landing')

WebUI.setText(findTestObject('Object Repository/User dapat menambahkan form input baru dengan klik Icon Add disetiap category/Page_Rize.inc HR Platform/input_Kode Perusahaan_company_code'), 
    'PER2150220815')

WebUI.setText(findTestObject('Object Repository/User dapat menambahkan form input baru dengan klik Icon Add disetiap category/Page_Rize.inc HR Platform/input_Masukan NIK Anda_nik'), 
    '3567088530006')

WebUI.click(findTestObject('Object Repository/User dapat menambahkan form input baru dengan klik Icon Add disetiap category/Page_Rize.inc HR Platform/button_Continue'))

WebUI.click(findTestObject('Object Repository/User dapat menambahkan form input baru dengan klik Icon Add disetiap category/Page_Rize.inc HR Platform/rect'))

WebUI.setText(findTestObject('Object Repository/User dapat menambahkan form input baru dengan klik Icon Add disetiap category/Page_Rize.inc HR Platform/textarea_Jam_activity0c4875a5e-e3fb-466e-9e_2b13c6'), 
    'Activity 1.1')

WebUI.click(findTestObject('Object Repository/User dapat menambahkan form input baru dengan klik Icon Add disetiap category/Page_Rize.inc HR Platform/div_Select_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/User dapat menambahkan form input baru dengan klik Icon Add disetiap category/Page_Rize.inc HR Platform/div_Operasionaleksekusi'))

WebUI.click(findTestObject('Object Repository/User dapat menambahkan form input baru dengan klik Icon Add disetiap category/Page_Rize.inc HR Platform/div_Select_css-19bb58m_1'))

WebUI.click(findTestObject('Object Repository/User dapat menambahkan form input baru dengan klik Icon Add disetiap category/Page_Rize.inc HR Platform/div_Tahunan'))

WebUI.setText(findTestObject('Object Repository/User dapat menambahkan form input baru dengan klik Icon Add disetiap category/Page_Rize.inc HR Platform/input_Tahunan_activity_count0c4875a5e-e3fb-_a3fa63'), 
    '1')

WebUI.setText(findTestObject('Object Repository/User dapat menambahkan form input baru dengan klik Icon Add disetiap category/Page_Rize.inc HR Platform/input_Tahunan_assessment_time0c4875a5e-e3fb_4911d7'), 
    '1')

WebUI.click(findTestObject('Object Repository/User dapat menambahkan form input baru dengan klik Icon Add disetiap category/Page_Rize.inc HR Platform/div_Select_css-19bb58m_1_2'))

WebUI.click(findTestObject('Object Repository/User dapat menambahkan form input baru dengan klik Icon Add disetiap category/Page_Rize.inc HR Platform/div_Jam'))

WebUI.click(findTestObject('Object Repository/User dapat menambahkan form input baru dengan klik Icon Add disetiap category/Page_Rize.inc HR Platform/div_Save'))

WebUI.click(findTestObject('Object Repository/User dapat menambahkan form input baru dengan klik Icon Add disetiap category/Page_Rize.inc HR Platform/button_Continue_1'))

WebUI.delay(3)

WebUI.closeBrowser()

