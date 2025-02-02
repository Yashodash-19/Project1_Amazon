package amazon_Project1.Project1_Amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage 
{
	WebDriver driver;
	@FindBy(xpath="//button[@class='edit-pencil-icon-button']")
	WebElement edit_button;
	
	@FindBy(xpath="//input[@id='editProfileNameInputId']")
	WebElement editprofilename_textbox;
	
	@FindBy(xpath="(//span[.='Continue'])[1]")
	WebElement continue_button;
	
	public void edit()
	{
		
		edit_button.click();
		editprofilename_textbox.clear();
		editprofilename_textbox.sendKeys("Yashoda");
		continue_button.click();
	}
	
	public ProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
