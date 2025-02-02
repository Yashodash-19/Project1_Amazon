package amazon_Project1.Project1_Amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

;

public class TestCase10_Updatingproductandremove extends LoginQuit
{
	@Test(retryAnalyzer=RetryTests.class)
	public void addtocart_logout() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		HomePage homepage=new HomePage(driver);
		homepage.accountandlist(driver);
		homepage.signin();
		
		LoginPage loginpage=new LoginPage(driver);
		Thread.sleep(1000);
		loginpage.un();
		loginpage.continue_button();
		loginpage.pwd();
		loginpage.sigin();
		homepage.search();
		Searchresultpage searchresult=new Searchresultpage(driver);
		searchresult.search();
		Product1Page  productpage=new Product1Page(driver);
		
		productpage.addtocart(driver);
		productpage.gotocart(driver);
		Addcartpage addtocart=new Addcartpage(driver);
		addtocart.incrementprod();
        addtocart.delete();
        
	}

}
