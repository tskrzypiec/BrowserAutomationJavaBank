package pl.TS.ing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreditPage extends BasePage {
	
	private final String navigateToCreditCalcXpath = new String ("//div[contains(@class,'teaser_tiles_inner')]//h3[@class='header']/a[./span[text()='Pożyczka gotówkowa']]");
	By byCalcLink = By.xpath(navigateToCreditCalcXpath);
		
	public CreditPage(WebDriver driver) {
		super(driver);
	}
	
	public CalcPage navigateToCalcLink() {
		click(byCalcLink);
		return new CalcPage(driver);
	}
	
}
