package com.qa.opencart.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.qa.opencart.baseTest.BaseTest;
import com.qa.opencart.pages.HomePage;

public class HomePageTest extends BaseTest {

	@Test
	public void validateSucessMessage() {
		loginPage.navigateToHomePage();
		loginPage.doLogin();
		String message = homePage.successMessage();
		Assert.assertEquals(message.contains("Success: You have added"), true);

	}

}
