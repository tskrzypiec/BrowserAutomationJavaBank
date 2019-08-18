package pl.TS.ing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
	
	protected WebDriver driver;
	final String acceptCookiesCreditsPageXpath = new String("//div[@class='cookie-policy-content']//span[contains(@class,'js-cookie-policy-main-accept-button') and text()='Zaakceptuj']");

	protected By byAcceptCookies = By.xpath(acceptCookiesCreditsPageXpath);
	
	protected BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public BasePage acceptCookies() {
		// TODO add checking if the element is actually on page
		driver.findElement(byAcceptCookies).click();
		return this;
	}
	
	protected void click(By loc) {
		driver.findElement(loc).click();
		
	}
	
	protected void setTextField(By loc, String s) {
		WebElement field = driver.findElement(loc);
		field.clear();
		field.sendKeys(s);
	}
	
	protected void refreshFocus(By byWhichDoesNotHaveClickAction) {
		driver.findElement(byWhichDoesNotHaveClickAction).click();
	}
	
	protected String getTextField(By loc) {
		return driver.findElement(loc).getText();
	}
	
}
