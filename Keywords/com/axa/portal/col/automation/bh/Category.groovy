package com.axa.portal.col.automation.bh

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.By

public class Category {
	private final static WebDriver WEB_DRIVER =  DriverFactory.getWebDriver();

	@Keyword
	//Validar si la categoria propuesta existe en la lista de categorias
	public Boolean matchedCategory(String xpathCategoryContainer, String selectedCategory) {
		try {
			WebElement divContainer = WEB_DRIVER.findElement(By.xpath(xpathCategoryContainer));
			List<WebElement> elements = divContainer.findElements(By.tagName("a"));

			//Recorre los elementos del div en donde estan las categorias disponibles
			for (int i = 1; i < elements.size(); i++) {
				if (elements.get(i).getText().toLowerCase().contains(selectedCategory)) {
					return true;
				}
			}
		} catch(NoSuchElementException e) {
			System.out.print("Error al encontrar el elemento Category Container: " + e);
		}
		return false;
	}
}
