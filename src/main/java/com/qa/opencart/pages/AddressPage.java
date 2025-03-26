package com.qa.opencart.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class AddressPage {

	Page page;

	private String addressBook = "//a[text()='Address Book']";

	private String newAddressButton = "//a[text()='New Address']";

	private String firstName = "//input[@id='input-firstname']";

	private String lastName = "//input[@id='input-lastname']";

	private String address = "//input[@id='input-address-1']";

	private String city = "//input[@id='input-city']";

	private String postCode = "//input[@id='input-postcode']";

	private String continueButton = "//input[@type='submit']";

	private String successMessage = "//div[@class= 'alert alert-success alert-dismissible']";

	public AddressPage(Page page) {
		this.page = page;
	}

	public void clickOnAddressBook() {
		page.click(addressBook);

	}

	public void clickOnNewAddressButton() {
		page.click(newAddressButton);
	}

	
	//To Handle Dropdown with Select Class
	public void selectDropDown() {
		Locator country = page.locator("//select[@id='input-country']");
		country.selectOption("India");
		Locator zone = page.locator("//select[@id='input-zone']");
		zone.selectOption("Goa");
	}

	public void fillAddressDetails() {
		page.fill(firstName, "test");
		page.fill(lastName, "test123");
		page.fill(address, "twyeehbhd");
		page.fill(city, "testing");
		page.fill(postCode, "12345");
		page.selectOption("//select[@id='input-country']", "India");
		page.selectOption("//select[@id='input-zone']", "Goa");

	}

	public void clickOnContinueButton() {
		page.click(continueButton);
	}

	public String successMessageText() {
		clickOnAddressBook();
		clickOnNewAddressButton();
		fillAddressDetails();
		clickOnContinueButton();
		return page.textContent(successMessage);

	}

}
