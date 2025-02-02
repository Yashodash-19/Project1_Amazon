package amazon_Project1.Project1_Amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class TestCase13_Cupon  extends LoginQuit
{
	@Test
     public void couponcode() throws InterruptedException, EncryptedDocumentException, IOException
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
		Searchresultpage  search=new Searchresultpage(driver);
		search.search();
		Product1Page  productpage=new Product1Page(driver);
		productpage.coupon(driver);
		
		
		
		
     }
}
