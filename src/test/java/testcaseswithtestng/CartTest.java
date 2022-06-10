package testcaseswithtestng;


import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.CartPage;

public class CartTest extends BaseTest{
	
	@Test
	public void verifyMovingPrdToWishList(String productName) {
		CartPage cartpage = new CartPage();
		cartpage.moveProductToWishList(productName);
	}
	
	@Test
	public void verifyPrdRetainsInCart() {
		CartPage cartpage = new CartPage();
		cartpage.prdRetainsInCart();
	}
	
}
