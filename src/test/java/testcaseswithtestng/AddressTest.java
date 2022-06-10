package testcaseswithtestng;

import pages.AddressPage;

import org.testng.annotations.Test;

public class AddressTest extends BaseTest{
	@Test
	public void verifyAddingAddress(String location) {
		AddressPage addressPage = new AddressPage();
		addressPage.addAddress(location);
	}
	
}
