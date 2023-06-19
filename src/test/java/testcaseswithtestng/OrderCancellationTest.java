package testcaseswithtestng;



import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.OrderCancellationPage;

public class OrderCancellationTest extends BaseTest{
	
	@Test
	@Parameters("orderId")
	public void verifyProductCancellation(String orderId) {
		OrderCancellationPage orderCancellationPage = new OrderCancellationPage();
		orderCancellationPage.orderCancellation(orderId);
		Assert.assertEquals(orderCancellationPage.getCancelledOrders().get(0), "order_987684");

	}
	
	@Test
	public void verifyOrderReturn() {
		OrderCancellationPage orderCancellationPage = new OrderCancellationPage();
		orderCancellationPage.returnOrder("order_987684");
	}

}
