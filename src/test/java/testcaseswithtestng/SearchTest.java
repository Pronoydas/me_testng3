package testcaseswithtestng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import pages.SearchPage;

public class SearchTest extends BaseTest{

	public class DProvider {
		@DataProvider (name = "data-provider")
		public Object[][] dpMethod(){
			return new Object[][] {{"iPhone-6"}, {"iPhone-7"},{"iPhone-8"},{"iPhone-X"},{"iPhone-11"},{"iPhone-12"},{"iPhone-13"},{"iPhone-14"}};
		}
		@Test (dataProvider = "data-provider")
	public void verifySearchProduct(String val) {
			SearchPage searchPage = new SearchPage();
			searchPage.searchProduct(val);
		}
	}
}
