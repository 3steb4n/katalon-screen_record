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
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

//GlobalVariable.category = CustomKeywords.'com.axa.portal.col.automation.bh.Category.getCategoryName'()
WebUI.waitForElementVisible(findTestObject('Index_Elements/Page_STORE/categories_list'), 5)

//That is used to click the category based into the TestObject (That's converted from a WebElement)
//WebUI.click(CustomKeywords.'com.axa.portal.col.automation.bh.Category.getCategory'(findTestObject('Index_Elements/Page_STORE/categories_list').findPropertyValue(
//'xpath'), category.toString().toLowerCase()))
WebUI.click(findTestObject('Index_Elements/Page_STORE/category', [('selectedCategory') : category]))

TestObject productObject = findTestObject('Index_Elements/Page_STORE/product', [('selectedProduct') : product])

while (true) {
	if (WebUI.waitForElementVisible(productObject, 3)) {
		WebUI.click(productObject)
		break
	} else {
		if (WebUI.waitForElementVisible(findTestObject('Index_Elements/Page_STORE/button_Next'), 3)) {
			WebUI.click(findTestObject('Index_Elements/Page_STORE/button_Next'))
		} else {
			KeywordUtil.markFailed("Error to found the product $product")
			break
		}
	}
}

WebUI.waitForElementVisible(findTestObject('product_page/add_cart-button'), 5)

WebUI.click(findTestObject('product_page/add_cart-button'))

WebUI.waitForAlert(5)
