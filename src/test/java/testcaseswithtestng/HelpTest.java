package testcaseswithtestng;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.HelpPage;

public class HelpTest extends BaseTest {
    @Parameters("parameter")
	@Test(dependsOnMethods = "verifyAboutUs")
	public void verifyContactUs(@Optional("Contact Us") String parameter) {
		HelpPage helpPage = new HelpPage();
		helpPage.clickOnLink(parameter);
		
		
	}
	@Parameters("parameter1")
	@Test
	public void verifyAboutUs(@Optional("About Us") String parameter1) {
		HelpPage helpPage = new HelpPage();
		helpPage.clickOnLink(parameter1);
		Assert.assertFalse(true);
	}

}
