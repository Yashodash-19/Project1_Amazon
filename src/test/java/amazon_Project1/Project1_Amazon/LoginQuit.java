package amazon_Project1.Project1_Amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
@Listeners(value = TestListener.class)
public class LoginQuit 
{
	
public static WebDriver driver;
	
	
	//@Parameters("browser")
	@BeforeMethod
	
  /*	public void launch(String nameofthebrowser)
	{
		if(nameofthebrowser.equals("chrome"))
		{
		driver=new ChromeDriver();
		}
		else if(nameofthebrowser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.navigate().refresh();
	}*/
	
	public void launch()
	{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.navigate().refresh();
	}
	@AfterMethod
	public void quit()
	{
		//driver.quit();
	}

	
	
	
}
