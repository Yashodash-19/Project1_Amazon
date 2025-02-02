package amazon_Project1.Project1_Amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Paymentpage 
{
	WebDriver driver;
	WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(20));
	// @FindBy(xpath="//*[@id=\"checkout-paymentOptionPanel\"]/div/div[2]/span/a")
   //  WebElement changepayment_link;
	 
	// @FindBy(xpath = "//span[@class='pmts-instrument-selector pmts-apb-radio-button']")
		//WebElement amazonpaybalance_button;
	
	@FindBy(xpath="(//div[@class='a-radio'])[1]")
	WebElement amazonpaybalance_button;
	
	@FindBy(xpath="(//div[@class='a-radio'])[2]")
	WebElement amazonpayupi_button;
	
	@FindBy(xpath="(//div[@class='a-radio'])[3]")
	WebElement creditanddebit_button;
	
	
	@FindBy(xpath="(//span[.='Net Banking'])[1]")
	WebElement netbanking_button;
	
	@FindBy(xpath="(//div[@class='a-radio'])[4]")
	WebElement otherupi_button;
	
	@FindBy(xpath="(//span[.='EMI'])[1]")
	WebElement emi_button;
	
	@FindBy(xpath="(//div[@class='a-radio'])[5]")
	WebElement cod_radiobutton;
	
	@FindBy(xpath="(//input[@class='a-button-input a-button-text'])[3]")
	WebElement usethispayment_button;
	@FindBy(xpath="(//input[@id='placeOrder'])[1]")
	WebElement placeyouroder_button;
	
	public void cod() throws InterruptedException
	{
		//Thread.sleep(2000);
		//changepayment_link.click();
		
		
		amazonpaybalance_button.click();
		Thread.sleep(2000);
		 amazonpayupi_button.click();
		 Thread.sleep(2000);
		 creditanddebit_button.click();
		 Thread.sleep(2000);
		 netbanking_button.click();
		 Thread.sleep(2000);
		 otherupi_button.click();
		 Thread.sleep(2000);
		  emi_button.click();
		  Thread.sleep(2000);
	//	cod_radiobutton.click();
	}
	public void usethispayment() throws InterruptedException
	{
		usethispayment_button.click();
		Thread.sleep(3000);
	}
	
	
	public void placeyouroder() throws InterruptedException
	{
		Thread.sleep(10000);
		
		placeyouroder_button.click();
	}
	
	public Paymentpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
