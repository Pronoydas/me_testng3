package testcaseswithtestng;

import pages.AddressPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddressTest extends BaseTest{
	@Test
	public void verifyAddingAddress() {
		AddressPage addressPage = new AddressPage();
		addressPage.addAddress("Pune");
	}
	
}
