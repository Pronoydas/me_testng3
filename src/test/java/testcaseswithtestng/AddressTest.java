package testcaseswithtestng;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.AddressPage;

public class AddressTest extends BaseTest{
	
	@Test
	@Parameters ({"location"})
	public void verifyAddingAddress(String location) {
		AddressPage addressPage = new AddressPage();
		addressPage.addAddress(location);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(addressPage.getAddress(), location, "mismatch in the address");
		//Assert.assertTrue(false,"Planted failure to test Listeners");//uncomment for Listeners activity
		
	}
	
}
