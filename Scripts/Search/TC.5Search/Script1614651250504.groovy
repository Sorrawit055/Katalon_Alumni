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

WebUI.navigateToUrl('http://alumni61-47.byethost12.com/Alumni61-47/index.php/alumni/?i=1')

WebUI.click(findTestObject('Object Repository/Searchfail/Page_/a_'))

WebUI.click(findTestObject('Object Repository/Searchfail/Page_/form_                                      _e9fc7d'))

WebUI.setText(findTestObject('Object Repository/Searchfail/Page_/input__s_email'), '614259055@webmail.npru.ac.th')

WebUI.click(findTestObject('Object Repository/Searchfail/Page_/form_                                      _e9fc7d'))

WebUI.setEncryptedText(findTestObject('Object Repository/Searchfail/Page_/input__s_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Searchfail/Page_/button_'))

WebUI.click(findTestObject('Object Repository/Searchfail/Page_/a__1'))

WebUI.setText(findTestObject('Object Repository/Searchfail/Page_/input__searchalumni'), 'งงไม่ทำได้ไหม')

WebUI.sendKeys(findTestObject('Object Repository/Searchfail/Page_/input__searchalumni'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Searchfail/Page_/html_                                      _afdad0'))

WebUI.click(findTestObject('Object Repository/Searchfail/Page_/th_'))

WebUI.click(findTestObject('Object Repository/Searchfail/Page_/h2_'))

