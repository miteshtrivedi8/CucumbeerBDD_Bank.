package actions;

import org.openqa.selenium.WebDriver;

import elements.Registerpage_Elements;
import steps.Common_Steps;

public class Registerpage_Action {
	
	WebDriver driver;
	Registerpage_Elements registerpage_elements;
	
	public Registerpage_Action(Common_Steps common_steps) {
		this.driver = common_steps.getDriver();
		registerpage_elements = new Registerpage_Elements(driver);
		
	}
			public void ClickRegisterlink() {
				registerpage_elements.Registerlink.click();
				
			}
			
			public void AddFirstName(String firstname) {
				registerpage_elements.FirstName.sendKeys(firstname);
				
			}
			
			public void AddLastName(String lastname) {
				registerpage_elements.LastName.sendKeys(lastname);
				
			}
			
			public void AddAddress(String address) {
				registerpage_elements.Address.sendKeys(address);	
			}
			
			public void AddCity(String city) {
				registerpage_elements.City.sendKeys(city);	
			}
			
			public void AddState(String state) {
				registerpage_elements.State.sendKeys(state);	
			}
			public void AddZipCode(String zipcode) {
				registerpage_elements.ZipCode.sendKeys(zipcode);	
			}
			
			public void AddPhone(String phone) {
				registerpage_elements.Phone.sendKeys(phone);	
			}
			
			public void AddSSN(String ssn) {
				registerpage_elements.SSN.sendKeys(ssn);	
			}
			
			public void AddUsername(String username) {
				registerpage_elements.Username.sendKeys(username);	
			}
			public void AddPassword(String password) {
				registerpage_elements.Password.sendKeys(password);	
			}
			
			public void AddConfirm(String confirm) {
				registerpage_elements.Confirm.sendKeys(confirm);	
			}
			
			public void clickRegister() {
				registerpage_elements.Register.click();
			}
			
			
}
