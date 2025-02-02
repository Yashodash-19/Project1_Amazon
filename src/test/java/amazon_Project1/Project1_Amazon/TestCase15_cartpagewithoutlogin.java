package amazon_Project1.Project1_Amazon;

import org.testng.annotations.Test;



public class TestCase15_cartpagewithoutlogin extends LoginQuit
{
	@Test(retryAnalyzer=RetryTests.class)
	public void cartwitoutlogin() throws InterruptedException 
	{
		HomePage homepage=new HomePage(driver);
		homepage.search();
		Searchresultpage searchresult=new Searchresultpage(driver);
		searchresult.search();
		Product1Page  productpage=new Product1Page(driver);
		productpage.addtocart(driver);	
		productpage.gotocart(driver);
	}

}
