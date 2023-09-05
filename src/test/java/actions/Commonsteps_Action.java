package actions;

import org.openqa.selenium.WebDriver;

import steps.Common_Steps;

public class Commonsteps_Action {
	
	WebDriver driver;
	
	Common_Steps common_steps;

	public  Commonsteps_Action (Common_Steps common_steps) {
		
		this.driver = common_steps.getDriver();	
	}
	
	public void goToUrl(String url) {
		driver.get(url);
	}
	
	public String getCurrentPageUrl() {
		return driver.getCurrentUrl();
		
	}
}
