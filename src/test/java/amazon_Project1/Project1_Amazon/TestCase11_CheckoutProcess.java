package amazon_Project1.Project1_Amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;



public class TestCase11_CheckoutProcess extends LoginQuit
{
	@Test(retryAnalyzer=RetryTests.class)
	public void login_cart_logout1() throws InterruptedException, EncryptedDocumentException, IOException
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
		productpage.wishlist(driver);
		productpage.continueshopping();
		productpage.addtocart(driver);	
		productpage.proccedtobuy();
		Addresspage address =new Addresspage(driver);
		address.change1();
		address.address();
		address.delivertothisaddress();
		
		Checkoutpage checkout=new Checkoutpage(driver);
		checkout.changeaddress();
		
		//checkout.placeorder();
		//productpage.movingcontroltohomepage(driver);
		//homepage.logout(driver);
		
		
		
		
		
}

}
