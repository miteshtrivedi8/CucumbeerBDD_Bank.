package actions;

import org.openqa.selenium.WebDriver;

import elements.login_Elements;
import steps.Common_Steps;

public class Login_Action {

	WebDriver driver;
	login_Elements login_elements;
	
	public Login_Action(Common_Steps common_steps) {
		this.driver = common_steps.getDriver();
		login_elements = new login_Elements(driver);
}
	public void AddUsername(String username)
	{
		login_elements.Username1.sendKeys(username);
		
	}
	
	public void Addpassword(String password)
	{
		login_elements.Password1.sendKeys(password);
		
	}
	public void clicklogin()
	{
		login_elements.Login.click();
		
	}
}