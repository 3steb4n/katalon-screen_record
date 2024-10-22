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

WebUI.openBrowser('https://www.demoblaze.com/index.html')

WebUI.maximizeWindow()

WebUI.verifyElementClickable(findTestObject('login_elements/Page_STORE/a_Sign up'))

WebUI.click(findTestObject('login_elements/Page_STORE/a_Sign up'))

WebUI.verifyElementClickable(findTestObject('login_elements/Page_STORE/input_Username_sign-username'))

WebUI.sendKeys(findTestObject('login_elements/Page_STORE/input_Username_sign-username'), CustomKeywords.'com.axa.portal.col.automatizacion.bh.User.getUsername'())

WebUI.sendKeys(findTestObject('login_elements/Page_STORE/input_Password_sign-password'), CustomKeywords.'com.axa.portal.col.automatizacion.bh.User.getPassword'())

WebUI.click(findTestObject('login_elements/Page_STORE/button_Sign up'))

WebUI.waitForAlert(10)

WebUI.getAlertText()

WebUI.verifyEqual(WebUI.getAlertText(), 'Sign up successful.')

WebUI.closeBrowser()

