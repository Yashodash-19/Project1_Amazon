package amazon_Project1.Project1_Amazon;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage {

WebDriver driver;
WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(30));
	//step 1
	@FindBy(xpath="//span[@class='nav-line-2 ']")  
	WebElement accountandlist_hoverover;
	
	@FindBy(xpath="//a[.='Start here.']")
	WebElement Starthere_button;
	
	@FindBy(xpath="//button[.='Manage Profiles']")
	WebElement manageprofiles_button;
	
	@FindBy(xpath="//a[.='View']")
	WebElement view_button;
	
	@FindBy(xpath="(//span[.='Sign in'])[1]")  
	WebElement signin_home;
	
	@FindBy(name="field-keywords")
	WebElement search_button;
	
	@FindBy(xpath="//span[.='Sign Out']")
	WebElement logout_button;
	
	@FindBy(name="email")  
	WebElement username;
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement Accountandlistafterlogin_hoverover;
	
	//step 2
	public void accountandlist(WebDriver driver) throws InterruptedException
	{
		
	Actions a1=new Actions(driver);
	a1.moveToElement(accountandlist_hoverover).perform();	
	//Starthere_button.click();
	}
	public void signin()
	{
		signin_home.click();		
	}
	public void search()
	{
		
		search_button.sendKeys("shoes"+Keys.ENTER);
	}
	
	public void logout(WebDriver driver)
	{
		Actions action=new Actions(driver);
		action.moveToElement(Accountandlistafterlogin_hoverover).perform();
		
		logout_button.click();
		Assert.assertEquals(username.isDisplayed(), true);
	}
	
	public void view(WebDriver driver) throws InterruptedException
	{
		
		Actions action=new Actions(driver);
		action.moveToElement(Accountandlistafterlogin_hoverover).perform();
		//Thread.sleep(3000);
		w1.until(ExpectedConditions.visibilityOf(manageprofiles_button));
		manageprofiles_button.click();
		w1.until(ExpectedConditions.visibilityOf(view_button));
		view_button.click();
	}
	
	
	//step 3
	public HomePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	

}
