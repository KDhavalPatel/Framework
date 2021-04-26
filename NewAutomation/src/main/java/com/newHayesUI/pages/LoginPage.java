package com.newHayesUI.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(id = "username")
	WebElement uName;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "submitButton")
	WebElement loginButton;

	public void loginToApplication(String usernameApp, String passwordApp)
	{
		uName.sendKeys(usernameApp);
		password.sendKeys(passwordApp);
		loginButton.click();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		}
	}

}
