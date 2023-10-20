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

WebUI.setText(findTestObject('Object Repository/Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/input_Email_email'), 
    'neilsya.am.s.0.902@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/input_Password_password'), 
    'fzqqY0qJjYTuJiVJRZh4ag==')

WebUI.click(findTestObject('Object Repository/Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/label_Remember me'))

WebUI.click(findTestObject('Object Repository/Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/span_'))

WebUI.click(findTestObject('Object Repository/Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/h2_Organization'))

WebUI.click(findTestObject('Object Repository/Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/a_Organizations'))

WebUI.click(findTestObject('Object Repository/Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/a_Index View'))

WebUI.click(findTestObject('Object Repository/Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/a_Add Structure'))

WebUI.setText(findTestObject('Object Repository/Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/input_Name_name'), 
    'Manager 2')

WebUI.click(findTestObject('Object Repository/Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/div_Select Job'))

WebUI.click(findTestObject('Object Repository/Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/div_Assistant Manager - Job Level 2'))

WebUI.click(findTestObject('Object Repository/Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/input_Neck Position_tag'))

WebUI.click(findTestObject('Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/choose_worker_type'))

WebUI.click(findTestObject('Object Repository/Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/div_Normal'))

WebUI.setText(findTestObject('Object Repository/Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/input_Job Grade_job_grade'), 
    '5')

WebUI.setText(findTestObject('Object Repository/Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/input_Location_location'), 
    'location')

WebUI.setText(findTestObject('Object Repository/Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/input_Purpose_purpose'), 
    'purpose')

WebUI.setText(findTestObject('Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/p'), 
    'Educational Background')

WebUI.setText(findTestObject('Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/p_1'), 
    'Essential Experience')

WebUI.setText(findTestObject('Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/P_2'), 
    'Desireable Experience')

WebUI.click(findTestObject('Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/div_s'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/div_pssst x'))

WebUI.click(findTestObject('Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/div_Select Type Competency'))

WebUI.click(findTestObject('Object Repository/Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/div_1x'))

WebUI.click(findTestObject('Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/div_Select Grade Competency'))

WebUI.click(findTestObject('Object Repository/Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/div_s_1'))

WebUI.click(findTestObject('Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/div_Select'))

WebUI.click(findTestObject('Object Repository/Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/div_pssst x_1'))

WebUI.click(findTestObject('Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/div_Select Set Competency'))

WebUI.click(findTestObject('Object Repository/Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/div_1x_1'))

WebUI.click(findTestObject('Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/div_Select Grade Competency_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/div_s_1_2'))

WebUI.setText(findTestObject('Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/p_s'), 
    'Core Competencies')

WebUI.setText(findTestObject('Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/P_3'), 
    'Functional Competencies')

WebUI.setText(findTestObject('Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/P_4'), 
    'Skill Set')

WebUI.setText(findTestObject('Object Repository/Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/input_Pihak yang berhubungan_external_relation'), 
    'External')

WebUI.setText(findTestObject('Object Repository/Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/input_Pihak yang berhubungan_related_relation'), 
    'hubungan kerja')

WebUI.click(findTestObject('Object Repository/Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/button_Add Keuangan'))

WebUI.setText(findTestObject('Object Repository/Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/input_Non Keuangan_form-control form-contro_96ccb9'), 
    'keuangan')

WebUI.setText(findTestObject('Object Repository/Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/input_Non Keuangan_form-control form-contro_96ccb9_1'), 
    'Non Keuangan')

WebUI.click(findTestObject('Object Repository/Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/button_Add New Row'))

WebUI.setText(findTestObject('Object Repository/Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/input_Masalah dan Tantangan Kerja_form-cont_dd5a48'), 
    'Masalah dan tantangan')

WebUI.click(findTestObject('Organization - Index View/User dapat menambahkan struktur baru/Page_Rize.inc HR Platform/button_Submit'))

WebUI.delay(3)

WebUI.closeBrowser()

