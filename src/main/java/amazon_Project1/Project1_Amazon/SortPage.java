package amazon_Project1.Project1_Amazon;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SortPage 
{
     WebDriver driver;
     WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(20));
   
     @FindBy(name="s")
     WebElement sortby_dropdrown;
 
public void sortby() throws InterruptedException
{
	
	Select sort=new Select(sortby_dropdrown);
	sort.selectByVisibleText("Price: Low to High");
      
	Thread.sleep(3000);
	//sort.selectByIndex(3);
     sort.selectByVisibleText("Avg. Customer Review");
	
}
    public SortPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }

	
	

}
