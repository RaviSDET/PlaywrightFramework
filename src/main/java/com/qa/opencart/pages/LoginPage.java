package com.qa.opencart.pages;

import com.microsoft.playwright.Page;

public class LoginPage {

	// encaplusation
	Page page;

	// Locators

	private String myAccount = "//a[@title='My Account']";

	private String login = "//a[text()='Login']";

	private String email = "//input[@id='input-email']";

	private String password = "//input[@id='input-password']";

	private String loginButton = "//input[@type='submit']";

	private String homePageTitle = "//img[@title='naveenopencart']";

	// page constructor
	public LoginPage(Page page) {
		this.page = page;

	}



	// page Actions/Methods
	public void doLogin() {
		page.click(myAccount);
		page.click(login);

		page.fill(email, "test27@gmail.com");
		page.fill(password, "Test@123");
		page.click(loginButton);
	}

	public String getTitle() {
		return page.title();

	}

	// Linking one page to another page
	// Created a homepage function in Loginpage

	public HomePage navigateToHomePage() {
		return new HomePage(page);
	}

}
