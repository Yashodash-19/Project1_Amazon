package amazon_Project1.Project1_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage 
{
	WebDriver driver;
	@FindBy(xpath="(//input[@name='placeYourOrder1'])[1]")
	WebElement placeyourorder_button;
	
	@FindBy(xpath="(//a[@class='a-link-normal expand-panel-button celwidget'])[2]")
	WebElement changepayment_button;
	
	@FindBy(xpath="//div[@id='pp-i0STI1-170']")
	WebElement cod_button;
	
	public void changeaddress() throws InterruptedException
	{
		//Thread.sleep(3000);
		//changepayment_button.click();
		Thread.sleep(3000);
		//cod_button.click();
	}
	
	
	public  void placeorder() throws InterruptedException
	{
		Thread.sleep(3000);
		placeyourorder_button.click();
	}
   public  Checkoutpage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
}

