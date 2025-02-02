package amazon_Project1.Project1_Amazon;
//Test if a new user can successfully register
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class TestCase1_Registration extends LoginQuit
{

	@Test
	public void registartion() throws InterruptedException
	{
		HomePage homepage=new HomePage(driver);
		homepage.accountandlist(driver);
		homepage.signin();
		
		
	}

}
