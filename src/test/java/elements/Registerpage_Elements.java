package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpage_Elements {
	
	WebDriver driver;
	
	@FindBy(xpath = "//a[contains(text(),'Register')]") public WebElement Registerlink;
	@FindBy(xpath = "//input[@id='customer.firstName']") public WebElement FirstName;
	@FindBy(xpath = "//input[@id='customer.lastName']") public WebElement LastName;
	@FindBy(xpath = "//input[@id='customer.address.street']") public WebElement Address;
	@FindBy(xpath = "//input[@id='customer.address.city']") public WebElement City;
	@FindBy(xpath = "//input[@id='customer.address.state']") public WebElement State;
	@FindBy(xpath = "//input[@id='customer.address.zipCode']") public WebElement ZipCode;
	@FindBy(xpath = "//input[@id='customer.phoneNumber']") public WebElement Phone;
	@FindBy(xpath = "//input[@id='customer.ssn']") public WebElement SSN;
	@FindBy(xpath = "//input[@id='customer.username']") public WebElement Username;
	@FindBy(xpath = "//input[@id='customer.password']") public WebElement Password;
	@FindBy(xpath = "//input[@id='repeatedPassword']") public WebElement Confirm;
	@FindBy(xpath = "//tbody/tr[13]/td[2]/input[1]") public WebElement Register;
	
	public Registerpage_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
