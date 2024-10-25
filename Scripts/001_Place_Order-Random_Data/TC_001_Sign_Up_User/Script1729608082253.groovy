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

'Generate a dummy user from Custom KeyWord.'
(GlobalVariable.credentialsWebUser[0]) = CustomKeywords.'com.axa.portal.col.automation.bh.User.getUsername'()

'Generate a dummy password from Custom Keyword.'
(GlobalVariable.credentialsWebUser[1]) = CustomKeywords.'com.axa.portal.col.automation.bh.User.getPassword'()

WebUI.verifyElementClickable(findTestObject('Sign_Up-Elements/Page_STORE/a_Sign up'))

WebUI.click(findTestObject('Sign_Up-Elements/Page_STORE/a_Sign up'))

WebUI.verifyElementClickable(findTestObject('Sign_Up-Elements/Page_STORE/input_Username_sign-username'))

WebUI.sendKeys(findTestObject('Sign_Up-Elements/Page_STORE/input_Username_sign-username'), GlobalVariable.credentialsWebUser[
    0])

WebUI.sendKeys(findTestObject('Sign_Up-Elements/Page_STORE/input_Password_sign-password'), GlobalVariable.credentialsWebUser[
    1])

WebUI.click(findTestObject('Sign_Up-Elements/Page_STORE/button_Sign up'))

WebUI.waitForAlert(10)

WebUI.getAlertText()

WebUI.verifyEqual(WebUI.getAlertText(), 'Sign up successful.')

