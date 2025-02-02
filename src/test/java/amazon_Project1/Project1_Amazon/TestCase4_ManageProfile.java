package amazon_Project1.Project1_Amazon;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//Check if a user can successfully edit their profile information.
import org.testng.annotations.Test;

public class TestCase4_ManageProfile extends LoginQuit
{
		@Test(retryAnalyzer=RetryTests.class)
		public void validcredential() throws InterruptedException, EncryptedDocumentException, IOException
		{
			HomePage homepage=new HomePage(driver);
			homepage.accountandlist(driver);
			homepage.signin();
            LoginPage loginpage=new LoginPage(driver);
			//Thread.sleep(1000);
			loginpage.un();
			loginpage.continue_button();
			loginpage.pwd();
			loginpage.sigin();
			homepage.view(driver);
			ProfilePage profile=new ProfilePage(driver);
			profile.edit();
		}

}
