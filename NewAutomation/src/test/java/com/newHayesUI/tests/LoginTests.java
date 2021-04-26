package com.newHayesUI.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.newHayesUI.pages.BaseClass;
import com.newHayesUI.pages.LoginPage;

public class LoginTests extends BaseClass {

	@Test
	public void loginToApp() {

		logger = report.createTest("Login to App");

		LoginPage lPage = PageFactory.initElements(driver, LoginPage.class);

		logger.info("App started");

		lPage.loginToApplication(excel.getStringData("Login", 1, 0), excel.getStringData("Login", 1, 1));

		logger.pass("login successfully");
	}

}
