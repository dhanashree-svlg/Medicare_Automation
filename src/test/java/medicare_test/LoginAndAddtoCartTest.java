package medicare_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import medicare_pages.LoginPage;
import medicare_pages.SignupPage;

public class LoginAndAddtoCartTest extends BaseClass 
{

	@Test (priority = 0)
	public void LoginAndAddtoCartSuccessTest() throws InterruptedException 
	{
		LoginPage lp = new LoginPage();
		lp.LoginFunction("anika12@admin.com","Anika@123");
		Thread.sleep(5000);
		lp.AddtoCart();
		WebElement AddtocartSuccess = driver.findElement(By.className("col-sm-10"));
		Assert.assertEquals(AddtocartSuccess.getText(), "Paracetamol\n"+ "Brand : Cipla\n"+ "\n"+ "Description : An antipyretic medicine used for fever.");
		// Capture screenshot after the test step 
		LoginAndAddtoCartTest.takeScreenshot(driver, "screenshots/testExample.png"); 

	}


	@Test (priority = 1)
	public void LoginFailureTest()
	{
		LoginPage lp = new LoginPage();
		lp.LoginFunction("anika12@admin.com","Anika@1");
		WebElement LoginFailureMessage = driver.findElement(By.xpath("//div[@class='alert alert-danger fade in']"));
		Assert.assertEquals(LoginFailureMessage.getText(), "Username and Password is invalid!");
		// Capture screenshot after the test step 
		LoginAndAddtoCartTest.takeScreenshot(driver, "screenshots/testExample.png");  
	}
	}