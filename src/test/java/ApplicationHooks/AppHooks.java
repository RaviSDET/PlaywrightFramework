package ApplicationHooks;

import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.microsoft.playwright.Page;
import com.qa.opencart.factory.PlaywrightFactory;
import com.qa.opencart.pages.AddressPage;
import com.qa.opencart.pages.HomePage;
import com.qa.opencart.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks {

	PlaywrightFactory pf;
	Page page;
	Properties prop;
	protected LoginPage loginPage;
	protected HomePage homePage;
	protected AddressPage addressPage;

	@Before
	public void setUp() {

		pf = new PlaywrightFactory();
		prop = pf.initProp();
		page = pf.initiateBrowser(prop);
		loginPage = new LoginPage(page);
		homePage = new HomePage(page);
		addressPage = new AddressPage(page);
	}

	@After
	public void tearDown() {
		page.context().browser().close();

	}

}
