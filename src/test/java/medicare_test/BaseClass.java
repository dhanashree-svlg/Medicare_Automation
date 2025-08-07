package medicare_test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	public static WebDriver driver;
	{

		driver = new ChromeDriver();
        driver.get("http://localhost:8081/medicare");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}


	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	
	public static void takeScreenshot(WebDriver driver, String filePath)
	{ 
		// Cast the WebDriver instance to TakesScreenshot 
		TakesScreenshot ts = (TakesScreenshot) driver; 
		// Capture the screenshot and store it in a file 
		File source = ts.getScreenshotAs(OutputType.FILE); 
		// Specify the destination file path 
		File destination = new File(filePath); 
		try { 
			// Copy the screenshot to the destination 
			FileUtils.copyFile(source, destination); 
		} catch (IOException e) { 
			System.out.println("Exception while taking screenshot: " + e.getMessage()); 
		} 
	} 


}