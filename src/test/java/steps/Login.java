package steps;

import static org.junit.Assert.fail;

import actions.Commonsteps_Action;
import actions.Login_Action;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	Commonsteps_Action commonsteps_action;
	Login_Action login_action;
	
	public Login(Commonsteps_Action commonsteps_action , Login_Action login_action)
	{
		this.commonsteps_action = commonsteps_action;
		this.login_action = login_action;
		
	}
	
	@Given("user is on Login page")
	public void user_is_on_login_page() {
		
		commonsteps_action.goToUrl("https://parabank.parasoft.com/parabank/index.htm");
	    
	}
	@When("user enters Login data using DataTable")
	public void user_enters_login_data_using_data_table(DataTable dataTable) {
	   login_action.AddUsername(dataTable.cell(0, 0));
	   login_action.Addpassword(dataTable.cell(0, 1));
	}

	@When("click on login button")
	public void click_on_login_button() throws Exception{
		login_action.clicklogin();
		Thread.sleep(10000);
	}

	@Then("user should be land on Bank home page")
	public void user_should_be_land_on_bank_home_page() {
	   
		String expUr = "https://parabank.parasoft.com/parabank/overview.htm";
		String actUr = commonsteps_action.getCurrentPageUrl();

		// Remove the session ID parameter from the actual URL
		actUr = actUr.replaceAll(";jsessionid=[^?]+", "");

		if (!expUr.equals(actUr)) {
		    fail("Page does not navigate to Home page");
		}
	}
}
