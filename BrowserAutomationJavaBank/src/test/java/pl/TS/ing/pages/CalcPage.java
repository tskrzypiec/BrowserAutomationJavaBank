package pl.TS.ing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CalcPage extends BasePage {
	
	private final By byLoanValue = By.name("value");
	private final By byLoanDuration = By.name("period");
	
	private final By byInstallmentRate = By.xpath("//span[@data-value='installment_str']");
	
	public CalcPage(WebDriver driver) {
		super(driver);
	}
	
	public CalcPage setLoanValue(String keysLoanValue) {
		setTextField(byLoanValue, keysLoanValue);
		refreshFocus(byInstallmentRate);
		return this;
	}
		
	public CalcPage setLoanDuration(String keysLoanDuration) {
		setTextField(byLoanDuration, keysLoanDuration);
		refreshFocus(byInstallmentRate);
		return this;
	}
	
	public String getActualInstallmentRate() {
		String stringActualInstallmentRate = getTextField(byInstallmentRate);
		// TODO currency trim might be separate
		return getTextField(byInstallmentRate).substring(0, stringActualInstallmentRate.length() - 3);	
	}
	
	

}
