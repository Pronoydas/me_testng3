package testcaseswithtestng;

import pages.AddressPage;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AddressTest extends BaseTest{
	@Parameters({"address"})
	@Test
	public void verifyAddingAddress(String address ) {
		AddressPage addressPage = new AddressPage();
		addressPage.addAddress(address);
		Assert.assertEquals(addressPage.getAddress(), address,"Address Not Match");
	}
	
}
