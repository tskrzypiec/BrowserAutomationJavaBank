package pl.TS.tests.ing;

import org.junit.Assert;
import org.junit.Test;

import pl.TS.ing.pages.CalcPage;
import pl.TS.ing.pages.CreditPage;
import pl.TS.ing.pages.MainPage;
import pl.TS.tests.common.BaseTest;

public class IngTest extends BaseTest {
	
	
	@Test
	public void testInstallmentCalc() {

		String keysLoanValue = new String("10000");
		String keysLoanDuration = new String("12");
		String expectedLoanRate = new String("939,37");
		
		MainPage mainPage = new MainPage(driver);
		CreditPage creditPage = mainPage.navigateToCreditLink();
		creditPage = (CreditPage) creditPage.acceptCookies();
		CalcPage calcPage = creditPage.navigateToCalcLink();
		
		calcPage = calcPage.setLoanValue(keysLoanValue);
		calcPage = calcPage.setLoanDuration(keysLoanDuration);

		Assert.assertEquals(expectedLoanRate, calcPage.getActualInstallmentRate()); 
	
	}
	
	
	@Test
	public void testInstallmentCalcFailedVersion() {

		String keysLoanValue = new String("10000");
		String keysLoanDuration = new String("12");
		String expectedLoanRate = new String("1939,37");
		
		MainPage mainPage = new MainPage(driver);
		CreditPage creditPage = mainPage.navigateToCreditLink();
		creditPage = (CreditPage) creditPage.acceptCookies();
		CalcPage calcPage = creditPage.navigateToCalcLink();
		
		calcPage = calcPage.setLoanValue(keysLoanValue);
		calcPage = calcPage.setLoanDuration(keysLoanDuration);

		Assert.assertEquals(expectedLoanRate, calcPage.getActualInstallmentRate()); 
	
	}

}
