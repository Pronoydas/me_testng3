package testcaseswithtestng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;

import pages.LoginPage;

public class LoginTest extends BaseTest{

   @DataProvider(name="Valid Credintials")
   public Object[][] validCredential(){
	return new Object[][]{{"admin123","abc@123"},{"admin","abc#123"},{"happy","abc$123"}};
   }


   
	@Test(dataProvider = "Valid Credintials")
	public void verifyValidCrds(String userName,String password) {
		LoginPage loginPage = new LoginPage();
		loginPage.enterUserName(userName);
		loginPage.enterPassword(password);
		Assert.assertTrue(loginPage.clickBtnLogin());
	}
	@Parameters({"invalidUserName","invalidPassword"})
	@Test
	public void verifyInValidCrds(String invalidUserName, String invalidPassword) {
		LoginPage loginPage = new LoginPage();
		loginPage.enterUserName(invalidUserName);
		loginPage.enterPassword(invalidPassword);
		loginPage.clickBtnLogin();
	}
}
