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

WebUI.verifyElementClickable(findTestObject('Log_In-Elements/Page_STORE/a_Log in'))

WebUI.click(findTestObject('Log_In-Elements/Page_STORE/a_Log in'))

WebUI.waitForElementClickable(findTestObject('Log_In-Elements/Page_STORE/input_Username_loginusername'), 5)

WebUI.sendKeys(findTestObject('Log_In-Elements/Page_STORE/input_Username_loginusername'), GlobalVariable.credentialsWebUser[0])

WebUI.waitForElementClickable(findTestObject('Log_In-Elements/Page_STORE/input_Password_loginpassword'), 5)

WebUI.sendKeys(findTestObject('Log_In-Elements/Page_STORE/input_Password_loginpassword'), GlobalVariable.credentialsWebUser[1])

WebUI.verifyElementClickable(findTestObject('Log_In-Elements/Page_STORE/button_Log in'))

WebUI.click(findTestObject('Log_In-Elements/Page_STORE/button_Log in'))

WebUI.waitForElementPresent(findTestObject('Log_In-Elements/Page_STORE/a_Welcome'), 5)

WebUI.verifyEqual(WebUI.getText(findTestObject('Log_In-Elements/Page_STORE/a_Welcome')), "Welcome ${GlobalVariable.credentialsWebUser[0]}")

