package steps;



import static org.junit.Assert.fail;

import actions.Commonsteps_Action;
import actions.Registerpage_Action;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registerpage {
	Commonsteps_Action commonsteps_action;
	Registerpage_Action registerpage_action;
	public Registerpage(Commonsteps_Action commonsteps_action, Registerpage_Action registerpage_action ) {
		this.commonsteps_action = commonsteps_action;
		this.registerpage_action = registerpage_action;
		
	}
	@Given("user is on parabank Homepage")
	public void user_is_on_parabank_homepage() {
		commonsteps_action.goToUrl("https://parabank.parasoft.com/parabank/index.htm");
	}

	@When("user click on Registerpage link") 
	public void user_click_on_registerpage_link()throws Exception {
		registerpage_action.ClickRegisterlink();
		Thread.sleep(1000);
	}

	@Then("user should be able to view the Registration page.")
	public void user_should_be_able_to_view_the_registration_page() {
		
		String expUrl = "https://parabank.parasoft.com/parabank/register.htm";
		String actUrl = commonsteps_action.getCurrentPageUrl();

		// Remove the session ID parameter from the actual URL
		actUrl = actUrl.replaceAll(";jsessionid=[^?]+", "");

		if (!expUrl.equals(actUrl)) {
		    fail("Page does not navigate to Home page");
		}
	
	}
	
	@Given("user is on Registration page")
	public void user_is_on_Registration_page() {
		commonsteps_action.goToUrl("https://parabank.parasoft.com/parabank/register.htm");
	}

	@When("user enters Registration data using DataTable")
	public void user_enters_registration_data_using_data_table(DataTable dataTable) {
		registerpage_action.AddFirstName(dataTable.cell(0, 0));
		registerpage_action.AddLastName(dataTable.cell(0, 1));
		registerpage_action.AddAddress(dataTable.cell(0, 2));
		registerpage_action.AddCity(dataTable.cell(0, 3));
		registerpage_action.AddState(dataTable.cell(0, 4));
		registerpage_action.AddZipCode(dataTable.cell(0, 5));
		registerpage_action.AddPhone(dataTable.cell(0, 6));
		registerpage_action.AddSSN(dataTable.cell(0, 7));
		registerpage_action.AddUsername(dataTable.cell(0, 8));
		registerpage_action.AddPassword(dataTable.cell(0, 9));
		registerpage_action.AddConfirm(dataTable.cell(0, 10));
	}

	@When("click on Register button")
	public void click_on_register_button() throws Exception {
		registerpage_action.clickRegister();
		
		Thread.sleep(1000);
	}

	@Then("user should be land on home page")
	public void user_should_be_land_on_home_page() {
		String expUrl2 = "https://parabank.parasoft.com/parabank/register.htm";
		String actUrl2 = commonsteps_action.getCurrentPageUrl();

		// Remove the session ID parameter from the actual URL
		actUrl2 = actUrl2.replaceAll(";jsessionid=[^?]+", "");

		if (!expUrl2.equals(actUrl2)) {
		    fail("Page does not navigate to Home page");
		}
	}
	    
	}


