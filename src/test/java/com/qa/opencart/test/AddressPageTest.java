package com.qa.opencart.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.baseTest.BaseTest;

public class AddressPageTest extends BaseTest {

	@Test
	public void ValidateSuccessMessage() {
		loginPage.navigateToHomePage();
		loginPage.doLogin();
		addressPage.successMessageText();
		String message = addressPage.successMessageText();
		Assert.assertEquals(message.contains(" Your address has been successfully "), true);
		System.out.println("Testing completed");

	}

}
