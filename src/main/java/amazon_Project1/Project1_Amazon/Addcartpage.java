package amazon_Project1.Project1_Amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addcartpage 
{
	WebDriver driver;
	@FindBy(xpath="//span[@class='a-icon a-icon-small-add']")
	WebElement incrementprod_button;
	
	@FindBy(name="quantityBox")
	WebElement quantitybox_button;
	
	@FindBy(xpath="(//span[@class='a-size-small sc-action-delete'])[1]")
	WebElement delete_button;
	
	public void incrementprod() throws InterruptedException
	{
		Thread.sleep(3000);
		int count=1;
		while(count<5)
		{
		//incrementprod_button.click();
			Thread.sleep(2000);
		incrementprod_button.click();
		//quantitybox_button.sendKeys("10" +Keys.ENTER);
		//Thread.sleep(3000);
		count++;
		//Thread.sleep(3000);
	}
	}
	public void delete() throws InterruptedException
	{
		Thread.sleep(3000);
		delete_button.click();
		Thread.sleep(3000);
	}
	
	public Addcartpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
