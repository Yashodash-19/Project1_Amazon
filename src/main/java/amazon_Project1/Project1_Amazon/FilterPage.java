package amazon_Project1.Project1_Amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FilterPage
{
	WebDriver driver;
	WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(30));
	@FindBy(xpath="(//span[.='See more'])[1]")
	WebElement seemore_button;
	
	@FindBy(xpath="(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left'])[10]")
	WebElement selectbrand_filter;

	@FindBy(linkText="10% Off or more")
	WebElement selectdiscount_filter;
	
	@FindBy(xpath="//span[.='2 Stars & Up']")
	WebElement selectreview_filter;
	
	@FindBy(xpath="//span[.='Get It by Tomorrow']")
	WebElement getittomorrow_filter;
	
	
	public void selectfilter(WebDriver driver) throws InterruptedException
	{
		getittomorrow_filter.click();
		Thread.sleep(3000);
		seemore_button.click();
	//	w1.until(ExpectedConditions.elementToBeClickable(selectbrand_filter));
		Thread.sleep(4000);
		selectbrand_filter.click();
		//w1.until(ExpectedConditions.elementToBeClickable(selectdiscount_filter));
		Thread.sleep(4000);
		selectdiscount_filter.click();
		//w1.until(ExpectedConditions.elementToBeClickable(selectreview_filter));
		//Thread.sleep(4000);
		//selectreview_filter.click();
	}
	
	public FilterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
