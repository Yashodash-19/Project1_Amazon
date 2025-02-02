package amazon_Project1.Project1_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addresspage 
{
	WebDriver driver;
   //  @FindBy(xpath="(//span[.='Proceed to checkout'])[3]")
   //  WebElement procedcheckout_button;
     @FindBy(xpath="(//div[@class='a-radio a-radio-fancy'])[3]")
     WebElement address_radiobutton;
     @FindBy(xpath="(//input[@class='a-button-input'])[1]")
     WebElement delivertothisaddress_button;
     @FindBy(xpath="(//a[@class='a-link-normal expand-panel-button celwidget'])[1]")
     WebElement change1address_link;
     
    /* public void procedcheckout() throws InterruptedException
     {
    	 Thread.sleep(3000);
    	 procedcheckout_button.click();
     }*/
     public void address() throws InterruptedException
     {
    	 Thread.sleep(5000);
    	 address_radiobutton.click();
    	 Thread.sleep(3000);
     }
     public void delivertothisaddress() throws InterruptedException
     {
    	 Thread.sleep(5000);
    	 delivertothisaddress_button.click();
    	 Thread.sleep(7000);
     }
     public void change1()
     {
    	 change1address_link.click();
     }
     
     public  Addresspage (WebDriver driver)
     {
    	 PageFactory.initElements(driver,this);
     }
     
}
