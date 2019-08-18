package pl.TS.tests.common;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	protected WebDriver driver;
	
	@Before
	public void beforeEachTest() {
		//System.setProperty("webdriver.chrome.driver", "‪C:/chromedriver.exe");

	    WebDriverManager.chromedriver().setup();
		
	    String isHeadless = System.getProperty("headless", "false");
		System.out.println("headlessMode: " + isHeadless);
		
		if (isHeadless.equals("true")) {
			ChromeOptions options = new ChromeOptions();
			options.setHeadless(true);
			driver = new ChromeDriver(options);
		} else {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

	}

	@After
	public void afterEachTest() {
		driver.quit();

	}
}
