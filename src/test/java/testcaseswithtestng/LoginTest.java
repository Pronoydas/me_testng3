package testcaseswithtestng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Optional;

import pages.LoginPage;

public class LoginTest extends BaseTest{

	@Test
	public void verifyValidCrds() {
		LoginPage loginPage = new LoginPage();
		loginPage.enterUserName("admin");
		loginPage.enterPassword("admin123");
		loginPage.clickBtnLogin();
	}
	
	@Test
	public void verifyInValidCrds() {
		LoginPage loginPage = new LoginPage();
		loginPage.enterUserName("admin123");
		loginPage.enterPassword("admin123");
		loginPage.clickBtnLogin();
	}
}
