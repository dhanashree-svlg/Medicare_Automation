package medicare_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import medicare_test.BaseClass;

public class SignupPage {

	WebDriver driver = BaseClass.driver; //to access the static variable should use classname.variable name


	//======================================Locators==========================
	@FindBy(xpath="//a[normalize-space()='Sign Up']")
	WebElement SignUp;

	@FindBy(xpath="//input[@name=\"firstName\"]")
	WebElement FirstName;

	@FindBy(xpath="//input[@name=\"lastName\"]")
	WebElement LastName;

	@FindBy(xpath = "//input[@name=\"email\"]")
	WebElement Email;

	@FindBy(xpath = "//input[@name=\"contactNumber\"]")
	WebElement ContactNumber;


	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement Password;

	@FindBy(xpath = "//input[@name=\"confirmPassword\"]")
	WebElement ConfirmPassword;

	//@FindBy(xpath = "//input[@id=\"role2\"]")
	//WebElement SelectRole;

	@FindBy(xpath = "//button[@class=\"btn btn-primary\"]")
	WebElement NextBillingBtn;

	@FindBy(xpath = "//input[@name=\"addressLineOne\"]")
	WebElement AddressLineOne;

	@FindBy(xpath = "//input[@name=\"addressLineTwo\"]")
	WebElement AddressLineTwo;

	@FindBy(xpath = "//input[@name=\"city\"]")
	WebElement City;

	@FindBy(xpath = "//input[@name=\"postalCode\"]")
	WebElement PostalCode;

	@FindBy(xpath = "//input[@name=\"state\"]")
	WebElement State;

	@FindBy(xpath = "//input[@name=\"country\"]")
	WebElement Country;

	@FindBy(xpath = "//button[@name=\"_eventId_confirm\"]")
	WebElement NextConfirm;

	@FindBy(xpath = "//a[@class=\"btn btn-lg btn-primary\"]")
	WebElement Confirm;

	// ======================= Methods ======================
	// constructor to initialize all the web elements 
	public SignupPage() 
	{
		PageFactory.initElements(driver, this);

	}
	public void SignupFunction(String FirstNameVal, String LastNameVal,String EmailVal,String ContactNumberVal, String PasswordVal, String ConfirmPasswordVal)
	{

		SignUp.click();
		FirstName.sendKeys(FirstNameVal);
		LastName.sendKeys(LastNameVal);
		Email.sendKeys(EmailVal);
		ContactNumber.sendKeys(ContactNumberVal);
		Password.sendKeys(PasswordVal);
		ConfirmPassword.sendKeys(ConfirmPasswordVal);
		//SelectRole.click();
		NextBillingBtn.click();
	}

	public void SignupAddress(String AddressLineOneVal, String AddressLineTwoVal,String CityVal,String PostalCodeVal, String StateVal, String CountryVal)
	{

		AddressLineOne.sendKeys(AddressLineOneVal);
		AddressLineTwo.sendKeys(AddressLineTwoVal);
		City.sendKeys(CityVal);
		PostalCode.sendKeys(PostalCodeVal);
		State.sendKeys(StateVal);
		Country.sendKeys(CountryVal);
		NextConfirm.click();
		Confirm.click();
	}}




