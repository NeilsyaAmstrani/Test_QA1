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

WebUI.setText(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/input_Kode Perusahaan_company_code'), 
    'PER2150220815')

WebUI.setText(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/input_Masukan NIK Anda_nik'), 
    '3567088530006')

WebUI.click(findTestObject('User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/button_Continue'))

WebUI.setText(findTestObject('User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/textarea_(Tanggung jawabtugas pegawai sesua_dd4115'), 
    'Activity 1')

WebUI.click(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/div_Select_css-19bb58m_1'))

WebUI.click(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/div_Perencanaan'))

WebUI.click(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/div_Select_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/div_Harian'))

WebUI.setText(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/input_Harian_activity_count0c4875a5e-e3fb-4_2bdb43'), 
    '1')

WebUI.setText(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/input_Harian_assessment_time0c4875a5e-e3fb-_0ee549'), 
    '8')

WebUI.click(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/div_Select_css-19bb58m_1_2'))

WebUI.click(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/div_Jam'))

WebUI.scrollToPosition(0, 50)

WebUI.setText(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/textarea_Ad Hoc'), 
    'Activity 2')

WebUI.click(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/div_Select'))

WebUI.click(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/div_Operasionaleksekusi_1'))

WebUI.click(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/div_Select_css-19bb58m_1_2_3'))

WebUI.click(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/div_Mingguan'))

WebUI.setText(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/input_Select_activity_count02270'), 
    '1')

WebUI.setText(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/input_Select_assessment_time02270'), 
    '1')

WebUI.click(findTestObject('User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/svg_Select_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/div_Jam_1'))

WebUI.scrollToPosition(0, 50)

WebUI.setText(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/textarea_Evaluation'), 
    'Evaluation')

WebUI.click(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/div_Select_css-19bb58m_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/div_Evaluasi Monitoring'))

WebUI.click(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/div_Select_css-19bb58m_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/div_Tahunan'))

WebUI.setText(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/input_Tahunan_activity_count02380'), 
    '2')

WebUI.setText(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/input_Tahunan_assessment_time02380'), 
    '40')

WebUI.click(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/div_Select_css-19bb58m_1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/div_Menit'))

WebUI.scrollToPosition(0, 50)

WebUI.setText(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/textarea_Menit_activity060'), 
    'Improvement')

WebUI.click(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/div_Select_css-19bb58m_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/div_Perencanaan_1'))

WebUI.click(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/div_Select_css-19bb58m_1_2_3_4_5_6_7_8'))

WebUI.click(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/div_Bulanan'))

WebUI.setText(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/input_Bulanan_activity_count060'), 
    '4')

WebUI.setText(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/input_Bulanan_assessment_time060'), 
    '30')

WebUI.click(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/div_Select_css-19bb58m_1_2_3_4_5_6_7_8_9'))

WebUI.click(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/div_Menit_1'))

WebUI.scrollToElement(findTestObject('User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/div_Final_Submit'), 
    200)

WebUI.click(findTestObject('User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/div_Final_Submit'))

WebUI.click(findTestObject('Object Repository/User mengisi WLA Form dengan simpan sebagai Permanen (Final Submit)/Page_Rize.inc HR Platform/button_Continue_1'))

WebUI.delay(3)

WebUI.closeBrowser()

