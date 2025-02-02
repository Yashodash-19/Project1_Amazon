package amazon_Project1.Project1_Amazon;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage 
{
WebDriver driver;
	//step 1
	@FindBy(name="email")  
	WebElement username;
	
	@FindBy(id="continue")  
	WebElement cntbutton;
	
	@FindBy(name="password")  
	WebElement password;
	
	@FindBy(id="signInSubmit")  
	WebElement signin_button;
	
	//step 2
	public void un() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\yasho\\eclipse-workspace\\Project1_Amazon\\DDT\\Yashoda.xlsx");
		      Workbook w1=  WorkbookFactory.create(f1);
		     String un=w1.getSheet("logindetails").getRow(1).getCell(0).getStringCellValue();
		      username.sendKeys(un);
	}
	public void un1() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\yasho\\eclipse-workspace\\Project1_Amazon\\DDT\\Yashoda.xlsx");
	      Workbook w1=  WorkbookFactory.create(f1);
	     String un1=w1.getSheet("logindetails").getRow(2).getCell(0).getStringCellValue();
	      username.sendKeys(un1);
	
	
	}
	public void continue_button() throws InterruptedException
	{
	cntbutton.click();
	Thread.sleep(3000);
	}
	public void pwd() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\yasho\\eclipse-workspace\\Project1_Amazon\\DDT\\Yashoda.xlsx");
	      Workbook w1=  WorkbookFactory.create(f1);
	     String pwd=w1.getSheet("logindetails").getRow(1).getCell(1).getStringCellValue();
		password.sendKeys(pwd);
																												
	}
	public void pwd1() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\yasho\\eclipse-workspace\\Project1_Amazon\\DDT\\Yashoda.xlsx");
	      Workbook w1=  WorkbookFactory.create(f1);
	     String pwd1=w1.getSheet("logindetails").getRow(2).getCell(1).getStringCellValue();
		password.sendKeys(pwd1);																										
	} 
	public void sigin() throws InterruptedException
	{
	signin_button.click();
	Thread.sleep(3000);
	//Assert.assertEquals(password.isDisplayed(), true);
	}
	//step 3
	public LoginPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	
}
