package amazon_Project1.Project1_Amazon;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//Ensure login fails with incorrect email or password.
import org.testng.annotations.Test;

public class TestCase3_Invalicredentials extends LoginQuit
{

	@Test(retryAnalyzer=RetryTests.class)
	public void Invalidcredential() throws InterruptedException, EncryptedDocumentException, IOException
	{
		HomePage homepage=new HomePage(driver);
		homepage.accountandlist(driver);
		homepage.signin();
		LoginPage loginpage=new LoginPage(driver);
		Thread.sleep(1000);
		loginpage.un1();
		loginpage.continue_button();
		loginpage.pwd1();
		loginpage.sigin();
		
	}


}
