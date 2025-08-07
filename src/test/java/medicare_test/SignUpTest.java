package medicare_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import medicare_pages.SignupPage;
import medicare_test.SignUpTest;

public class SignUpTest extends BaseClass{
	

	@Test (priority = 0)
	public void SignupSuccessTest() throws InterruptedException 
	{

		SignupPage sp = new SignupPage();
		sp.SignupFunction("Anika", "Roy", "anika16@admin.com","9003056133","Anika@123","Anika@123");
		Thread.sleep(5000);
		sp.SignupAddress("abcdefghij", "klmnopqrst", "Bangalore", "560004", "Karnataka", "India");
		Thread.sleep(5000);
        WebElement SignUpSuccessMessage = driver.findElement(By.className("text-center"));
		Assert.assertEquals(SignUpSuccessMessage.getText(), "Welcome!\n"+ "medicare.com\n"+ "You can use your email address as username to login!\n"+ "Login Here");
		// Capture screenshot after the test step 
		SignUpTest.takeScreenshot(driver, "screenshots/testExample.png"); 


	}
}