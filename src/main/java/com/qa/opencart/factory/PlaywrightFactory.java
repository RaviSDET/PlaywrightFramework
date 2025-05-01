package com.qa.opencart.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightFactory {

	Playwright playwright;
	Browser browser;
	BrowserContext browserContext;
	Page page;
	
	
	Properties prop;

	public Page initiateBrowser(Properties prop) {

		// Picking the browser value from properties file
		String browserName = prop.getProperty("browser");

		playwright = Playwright.create();

		switch (browserName.toLowerCase()) {
		case "chromium":
			browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			browserContext = browser.newContext();
			page = browserContext.newPage();
			// Picking the url from the properties file
			page.navigate(prop.getProperty("url"));
			break;

		case "firefox":
			playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
			browserContext = browser.newContext();
			page = browserContext.newPage();
			// Picking the url from the properties file
			page.navigate(prop.getProperty("url"));
			break;

		case "chrome":
			playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			browserContext = browser.newContext();
			page = browserContext.newPage();
			// Picking the url from the properties file
			page.navigate(prop.getProperty("url"));
			break;

		default:
			System.out.println("Enter Proper browser");
			break;

		}

		return page;

	}

	// initalize the properties file from config file

	public Properties initProp() {
		try {
			FileInputStream fileIp = new FileInputStream("./src/test/resource/Config/config.properties");
			prop = new Properties();
			prop.load(fileIp);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return prop;
	}

}