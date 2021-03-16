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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://alumni61-47.byethost12.com/Alumni61-47/index.php/alumni/index?i=1')

WebUI.click(findTestObject('Object Repository/Registertest/Page_/Page_/a_'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Registertest/Page_/Page_/select_'), 'นาย', true)

WebUI.setText(findTestObject('Object Repository/Registertest/Page_/Page_/input__s_fname'), 'qwret')

WebUI.click(findTestObject('Object Repository/Registertest/Page_/Page_/li_-'))

WebUI.setText(findTestObject('Object Repository/Registertest/Page_/Page_/input__s_fname'), 'qwretr')

WebUI.setText(findTestObject('Object Repository/Registertest/Page_/Page_/input__s_lname'), 'trrtr')

WebUI.doubleClick(findTestObject('Object Repository/Registertest/Page_/Page_/input__s_nickname'))

WebUI.setText(findTestObject('Object Repository/Registertest/Page_/Page_/input__s_nickname'), 'rtrt')

WebUI.selectOptionByValue(findTestObject('Object Repository/Registertest/Page_/Page_/select_                            _1'), 
    'ชาย', true)

WebUI.setText(findTestObject('Object Repository/Registertest/Page_/Page_/input__s_facebook'), 'trrtr')

WebUI.setText(findTestObject('Object Repository/Registertest/Page_/Page_/input__s_email'), '614259032@webmail.npru.ac.th')

WebUI.setEncryptedText(findTestObject('Object Repository/Registertest/Page_/Page_/input__s_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Registertest/Page_/Page_/input__s_repassword'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setText(findTestObject('Object Repository/Registertest/Page_/Page_/input__address1'), '45')

WebUI.setText(findTestObject('Object Repository/Registertest/Page_/Page_/input__address2'), '54')

WebUI.setText(findTestObject('Object Repository/Registertest/Page_/Page_/input__address3'), 'yutuyt')

WebUI.setText(findTestObject('Object Repository/Registertest/Page_/Page_/input__address4'), 'uytu')

WebUI.setText(findTestObject('Object Repository/Registertest/Page_/Page_/input__address2'), 'tutyu')

WebUI.setText(findTestObject('Object Repository/Registertest/Page_/Page_/input__address5'), '7300')

WebUI.selectOptionByValue(findTestObject('Object Repository/Registertest/Page_/Page_/select_    6147    61100'), '61/47', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Registertest/Page_/Page_/select_  2544  2545  2546   2547    2548   _7d0c27'), 
    '2564', true)

WebUI.setText(findTestObject('Object Repository/Registertest/Page_/Page_/input__s_generation'), '614259055')

WebUI.setText(findTestObject('Object Repository/Registertest/Page_/Page_/input__s_position'), 'นักศึกษา')

WebUI.setText(findTestObject('Object Repository/Registertest/Page_/Page_/textarea__s_address'), 'ดำหพด')

WebUI.setText(findTestObject('Object Repository/Registertest/Page_/Page_/input__s_phone'), '25685')

WebUI.click(findTestObject('Object Repository/Registertest/Page_/Page_/button_'))

WebUI.verifyTextPresent('ล็อคอิน', false)

WebUI.closeBrowser()

