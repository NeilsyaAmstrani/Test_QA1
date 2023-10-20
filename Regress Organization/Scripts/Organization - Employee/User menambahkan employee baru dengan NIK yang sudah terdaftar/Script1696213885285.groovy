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

WebUI.setText(findTestObject('Object Repository/Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/input_Email_email'), 
    'neilsya.am.s.0.902@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/input_Password_password'), 
    'fzqqY0qJjYTuJiVJRZh4ag==')

WebUI.click(findTestObject('Object Repository/Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/label_Remember me'))

WebUI.click(findTestObject('Object Repository/Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/span_'))

WebUI.click(findTestObject('Object Repository/Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/h2_Organization'))

WebUI.click(findTestObject('Object Repository/Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/a_Organizations'))

WebUI.click(findTestObject('Object Repository/Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/a_Employees'))

WebUI.click(findTestObject('Object Repository/Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/a_Add Employee'))

WebUI.setText(findTestObject('Object Repository/Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/input_NIK_nik'), 
    '35041')

WebUI.setText(findTestObject('Object Repository/Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/input_Name_nama'), 
    'Thomas')

WebUI.setText(findTestObject('Object Repository/Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/input_Email_email_1'), 
    'thomas@gmail.com')

WebUI.click(findTestObject('Object Repository/Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/div_Select'))

WebUI.click(findTestObject('Object Repository/Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/div_Manager'))

WebUI.setText(findTestObject('Object Repository/Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/input_Division_division'), 
    'Manager')

WebUI.setText(findTestObject('Object Repository/Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/input_Departement_department'), 
    'Manager')

WebUI.setText(findTestObject('Object Repository/Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/input_Salary_salary'), 
    '4000000')

WebUI.click(findTestObject('Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/select_region'))

WebUI.click(findTestObject('Object Repository/Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/div_Region A'))

WebUI.click(findTestObject('Object Repository/Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/div_Select Gender'))

WebUI.click(findTestObject('Object Repository/Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/div_Female'))

WebUI.click(findTestObject('Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/choose_tgl_birthday'))

WebUI.click(findTestObject('Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/tgl_birthday'))

WebUI.click(findTestObject('Object Repository/Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/div_Select Martial Status'))

WebUI.click(findTestObject('Object Repository/Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/div_Single'))

WebUI.click(findTestObject('Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/choose_tgl_join_date'))

WebUI.click(findTestObject('Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/tgl_join_date'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/div_Status Employee'))

WebUI.click(findTestObject('Object Repository/Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/div_Permanent'))

WebUI.setText(findTestObject('Object Repository/Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/input_Learning Hours_learning_hours'), 
    '4')

WebUI.setText(findTestObject('Object Repository/Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/input_Last Year Performance Rating_last_yea_8338b1'), 
    '4')

WebUI.setText(findTestObject('Object Repository/Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/input_Personal Grade_personal_grade'), 
    '5')

WebUI.click(findTestObject('Organization - Employee/User dapat menambahkan employee baru sesuai struktur yang ada/Page_Rize.inc HR Platform/a_Submit'))

WebUI.delay(3)

WebUI.closeBrowser()

