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

WebUI.navigateToUrl('http://alumni61-47.byethost12.com/Alumni61-47/index.php/alumni/index?i=2')

WebUI.click(findTestObject('Object Repository/View/Page_/a_'))

WebUI.setText(findTestObject('Object Repository/View/Page_/input__s_email'), '614259020@webmail.npru.ac.th')

WebUI.setEncryptedText(findTestObject('Object Repository/View/Page_/input__s_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/View/Page_/button_'))

WebUI.verifyTextPresent('ยินดีต้อนรับคุณ614259020@webmail.npru.ac.th', false)

WebUI.click(findTestObject('Object Repository/View/Page_/a__1'))

WebUI.click(findTestObject('Object Repository/View/Page_/a_614259020webmail.npru.ac.th'))

WebUI.click(findTestObject('Object Repository/View/Page_/a__1_2'))

WebUI.verifyTextPresent('614259020@webmail.npru.ac.th', false)

WebUI.closeBrowser()

