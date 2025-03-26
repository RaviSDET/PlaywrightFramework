package com.qa.opencart.baseTest;

import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.microsoft.playwright.Page;
import com.qa.opencart.factory.PlaywrightFactory;
import com.qa.opencart.pages.AddressPage;
import com.qa.opencart.pages.HomePage;
import com.qa.opencart.pages.LoginPage;

public class BaseTest {

	PlaywrightFactory pf;
	Page page;
	Properties prop;
	protected LoginPage loginPage;
	protected HomePage homePage;
	protected AddressPage addressPage;

	@BeforeTest
	public void setUp() {

		pf = new PlaywrightFactory();
		prop = pf.initProp();
		page = pf.initiateBrowser(prop);
		loginPage = new LoginPage(page);
		homePage = new HomePage(page);
		addressPage = new AddressPage(page);
	}

	@AfterTest
	public void tearDown() {
		page.context().browser().close();

	}

}
