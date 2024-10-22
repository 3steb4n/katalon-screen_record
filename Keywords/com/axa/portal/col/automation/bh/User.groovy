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

import internal.GlobalVariable

public class User {
	private String username;
	private String password;
	private static final Random RANDOM = new Random();
	private static final String ALPHABET = "abcdefghijklmnopqrstuvwyz0123456789";
	private static final int LIMIT_CHARACTER = 10;

	public User() {
		setUsername();
		setPassword();
	}

	private void setUsername() {
		StringBuilder username = new StringBuilder();

		for(int a = 0; a < LIMIT_CHARACTER; a++) {
			username.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
		}

		this.username = username.toString();
	}

	@Keyword
	public String getUsername() {
		return this.username;
	}

	private void setPassword() {
		StringBuilder password = new StringBuilder();

		for(int a = 0; a < LIMIT_CHARACTER; a++) {
			password.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
		}

		//System.out.println(password);
		this.password =  password.toString();
	}

	@Keyword
	public String getPassword() {
		return this.password;
	}
}
