package com.qa.opencart.pages;

import com.microsoft.playwright.Page;

public class HomePage {
	Page page;
	String Message;

	// Locators

	private String searchTab = "//input[@name='search']";

	private String searchButton = "//button[@type='button' and @class='btn btn-default btn-lg']";

	private String item = "(//a[text()='iPhone'])[1]";

	private String addToCart = "//button[@id='button-cart']";

	private String successMessage = "//div[text()='Success: You have added ']";

	public HomePage(Page page) {
		this.page = page;
	}

	// Actions

	public void findProduct() {
		page.fill(searchTab, "iphone");
		page.click(searchButton);

	}

	public void clickOnItem() {
		page.click(item);

	}

	public void clickOnCart() {
		page.click(addToCart);
	}

	public String successMessage() {
		findProduct();
		clickOnItem();
		clickOnCart();
		return page.textContent(successMessage);

	}
	
	
	
	public AddressPage navigateToAddAddress() {
		return new AddressPage(page);
	}
	
	

}
