package com.newHayesUI.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {

	WebDriver driver;

	public DashboardPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(id = "cpt-licensing-button")
	WebElement cptLicensingOkButton;

	public void navigateToAuditGroupPage() {

	}

}
