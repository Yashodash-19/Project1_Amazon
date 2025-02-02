package amazon_Project1.Project1_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateaccountPage
{
	WebDriver driver;
	@FindBy(id="ap_customer_name")
	WebElement firstandlastname_textbox;
	
	@FindBy(id="ap_phone_number")
	WebElement phoneno_textbox;
	
	@FindBy(name="password")
	WebElement password_textbox;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement verifymobileno_button;
}
