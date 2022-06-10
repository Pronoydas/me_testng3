package testcaseswithtestng;



import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.OrderCancellationPage;

public class OrderCancellationTest extends BaseTest{
	
	@Test
	@Parameters({"OrderId"})
	public void verifyProductCancellation(@Optional("order_987684") String OrderId) {
		OrderCancellationPage orderCancellationPage = new OrderCancellationPage();
		orderCancellationPage.orderCancellation(OrderId);
	}
	
	@Test
	public void verifyOrderReturn() {
		OrderCancellationPage orderCancellationPage = new OrderCancellationPage();
		orderCancellationPage.returnOrder("order_987684");
	}

}
