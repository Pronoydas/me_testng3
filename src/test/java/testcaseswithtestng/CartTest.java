package testcaseswithtestng;


import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.CartPage;

public class CartTest extends BaseTest{
	
	@Test
	public void verifyMovingPrdToWishList() {
		CartPage cartpage = new CartPage();
		cartpage.moveProductToWishList("IPhone-13");
	}
	
	@Test
	public void verifyPrdRetainsInCart() {
		CartPage cartpage = new CartPage();
		cartpage.prdRetainsInCart();
	}
	
}
