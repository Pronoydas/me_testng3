package testcaseswithtestng;

import pages.AddressPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddressTest extends BaseTest{
	@Test
	public void verifyAddingAddress() {
		AddressPage addressPage = new AddressPage();
		addressPage.addAddress("Pune");

		Assert.assertEquals("Crio.Do: Project-based learning platform for developer", "Crio.Do: Project-based learning platform for developers", "Titles of the website do not match");
	}
	
}
