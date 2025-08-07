package medicare_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import medicare_test.BaseClass;

public class LoginPage {
	
	WebDriver driver = BaseClass.driver; //to access the static variable should use classname.variable name


	//======================================Locators==========================
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement Login;

	@FindBy(xpath="//input[@name=\"username\"]")
	WebElement Email;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	WebElement Password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement Loginbtn;
	
	@FindBy(xpath="//a[normalize-space()='View Products']")
	WebElement ViewProducts;
	
	//@FindBy(xpath="//td[normalize-space()='Paracetamol']")
	//WebElement Product;

	@FindBy(xpath="//a[@class=\"btn btn-primary\"]")
	WebElement ViewBtn;
	
	@FindBy(xpath="//a[@class=\"btn btn-warning\"]")
	WebElement ContinueShoppingBtn;
	
	@FindBy(xpath="//tbody/tr[2]/td[6]/a[1]")
    WebElement ViewBtn1;
	
	@FindBy(xpath="//tbody/tr[2]/td[6]/a[2]/span[1]")
    WebElement CartBtn;
	
	//@FindBy(xpath="//a[@class=\"btn btn-success btn-block\"]")
   // WebElement Checkout;
	
	

	//@FindBy(xpath="//a[@class='btn btn-success']")
	//WebElement Addtocartbtn;
	

	
	// ======================= Methods ======================
		// constructor to initialize all the web elements 
		public LoginPage() 
		{
			PageFactory.initElements(driver, this);

		}
		public void LoginFunction(String EmailidVal, String PasswordVal)
		{
			Login.click();
			Email.sendKeys(EmailidVal);
			Password.sendKeys(PasswordVal);
			Loginbtn.click();	
		}
		
		public void AddtoCart() throws InterruptedException
		{
			ViewProducts.click();
			Thread.sleep(5000);	
			ViewBtn.click();
			Thread.sleep(5000);	
			ContinueShoppingBtn.click();
			Thread.sleep(5000);
			ViewBtn1.click();
			Thread.sleep(5000);
			ContinueShoppingBtn.click();
			Thread.sleep(5000);
			CartBtn.click();
			//Thread.sleep(5000);
			//Checkout.click();		
		    //Addtocartbtn.click();
		}
}





