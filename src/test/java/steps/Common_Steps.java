package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Common_Steps {
	WebDriver driver;
	
	@Before(order = 0)
	public void setup() {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\bhoga\\eclipse-workspace\\CucumberBestbuy\\webdriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions(); /* for browser*/
		options.setBinary("C:\\Users\\bhoga\\OneDrive\\Desktop\\chrome Driver\\chrome-win64\\chrome.exe");
		 driver = new ChromeDriver ();
	}
	
	@After(order = 1)
	public void tearDown(Scenario scenario) throws Exception {
		if (scenario.isFailed())
		{
			final byte[] scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(scr, "image/png",scenario.getName());
		}
			driver.quit();
			Thread.sleep(1000);
	}
	public WebDriver getDriver() {
		
		return driver;
		
	}
}
