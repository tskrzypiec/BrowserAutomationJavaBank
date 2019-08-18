package pl.TS.ing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

	private final String IngHomepage = new String("https://ingbank.pl/");
	private final String navigateToCreditPageXpath = new String("//a[@title=\"Kredyty i pożyczki\"]");
	
	By byCreditLink = By.xpath(navigateToCreditPageXpath);
	
	public MainPage(WebDriver driver) {
		super(driver);
		driver.get(IngHomepage);
	}
	
	public CreditPage navigateToCreditLink() {
		click(byCreditLink);
		return new CreditPage(driver);
	}
	

}
