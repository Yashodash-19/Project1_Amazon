package amazon_Project1.Project1_Amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(TestListener.class)
public class TestCase8_SortProduct extends LoginQuit
{
	
	@Test(retryAnalyzer=RetryTests.class)
	public void SortProduct() throws InterruptedException, EncryptedDocumentException, IOException
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
	SortPage sortproduct=new SortPage(driver);
	sortproduct.sortby();

}



}