package com.qa.opencart.test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TestDemo {

	public static void main(String[] args) {
		Playwright playwright = Playwright.create();

		Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));

		// Locators

		BrowserContext browserContext = browser.newContext();
		Page page = browserContext.newPage();
		page.navigate("https://www.orangehrm.com/");
		System.out.println(page.title());
		Locator bookDemo = page.locator("(//button[text()='Book a Free Demo'])[2]");
		bookDemo.click();

	}

}
