package amazon_Project1.Project1_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage 
{
	WebDriver driver;
	
	@FindBy(xpath="//a[@id='nav-orders']")
	WebElement order_button;
	
	@FindBy(xpath="//a[@id='a-autoid-7-announce']")
	WebElement sellerfeedback_button;
	
    @FindBy(xpath="(//label[@name='star5'])[1]")
	WebElement rating_button;
	
	
	public void ratings() throws InterruptedException
	{
		order_button.click();
		Thread.sleep(3000);
		sellerfeedback_button.click();
		Thread.sleep(3000);
		rating_button.click();
		
	}
	
	public OrderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
}
