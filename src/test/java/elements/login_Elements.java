package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_Elements {
	
WebDriver driver;

	@FindBy(xpath = "//div[@class='login']/input[@name='username']") public WebElement Username1;
	@FindBy(xpath = "//div[@class='login']/input[@name='password']") public WebElement Password1;
	@FindBy(xpath = "//div[@class='login']/input[@value='Log In']") public WebElement Login;
	
	public login_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
