package amazon_Project1.Project1_Amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchresultpage 
{
	WebDriver driver;
	@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[1]")	
	WebElement searchresult_product;
	
	
	public void search() throws InterruptedException
	{
		Thread.sleep(5000);
		
		searchresult_product.click();
	}
	
	
 public Searchresultpage(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
}
