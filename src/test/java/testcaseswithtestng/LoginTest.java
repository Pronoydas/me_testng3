package testcaseswithtestng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Optional;

import pages.LoginPage;

public class LoginTest extends BaseTest{

	@Test
	@Parameters({"validUserName","validPassword"})
	public void verifyValidCrds(String username, String password) {
		LoginPage loginPage = new LoginPage();
		loginPage.enterUserName(username);
		loginPage.enterPassword(password);
		loginPage.clickBtnLogin();
	}
	
	@Test
	@Parameters({"InvalidUserName","InvalidPassword"})
	public void verifyInValidCrds(@Optional("admin123") String InvalidUserName ,@Optional("admin123") String InvalidPassword) {
		LoginPage loginPage = new LoginPage();
		loginPage.enterUserName(InvalidUserName);
		loginPage.enterPassword(InvalidPassword);
		loginPage.clickBtnLogin();
	}
}
