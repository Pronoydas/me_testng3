package testcaseswithtestng;



import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.OrderCancellationPage;

public class OrderCancellationTest extends BaseTest{
	
	@Test
	public void verifyProductCancellation() {
		OrderCancellationPage orderCancellationPage = new OrderCancellationPage();
		orderCancellationPage.orderCancellation("order_987684");
	}
	
	@Test
	public void verifyOrderReturn() {
		OrderCancellationPage orderCancellationPage = new OrderCancellationPage();
		orderCancellationPage.returnOrder("order_987684");
	}

}
