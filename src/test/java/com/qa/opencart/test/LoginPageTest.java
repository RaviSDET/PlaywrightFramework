package com.qa.opencart.test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.qa.opencart.baseTest.BaseTest;
import com.qa.opencart.factory.PlaywrightFactory;
import com.qa.opencart.pages.LoginPage;

public class LoginPageTest extends BaseTest {

	@Test
	public void validateTitle() {

		loginPage.doLogin();
		String title = loginPage.getTitle();
		Assert.assertEquals(title, "Account Login");

	}

}
