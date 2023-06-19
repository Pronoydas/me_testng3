package testcaseswithtestng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.ProductReviewPage;

public class ProductReviewTest extends BaseTest{
    @Parameters("review")
	@Test
	public void verifyAddingReview(@Optional("Good") String review) {
		ProductReviewPage productReviewPage = new ProductReviewPage();
		productReviewPage.addProductReview(review);
	}
	
	@Test
	@Parameters({"review","a"})
	public void verifyEditReview(@Optional("Excellent") String review,@Optional("hello") String a) {
		ProductReviewPage productReviewPage = new ProductReviewPage();
		productReviewPage.editProductReview(review);

	}
}
