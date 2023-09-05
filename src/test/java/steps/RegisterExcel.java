package steps;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.util.ExcelReader;

import actions.Commonsteps_Action;
import actions.Registerpage_Action;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterExcel {
	ExcelReader excelreader;
	Commonsteps_Action commonsteps_action;
	Registerpage_Action registerpage_action;
	public RegisterExcel(Commonsteps_Action commonsteps_action, Registerpage_Action registerpage_action , ExcelReader excelreader) {
		this.commonsteps_action = commonsteps_action;
		this.registerpage_action = registerpage_action;	
		this.excelreader =  excelreader;
	}
	
	@Given("user is on Registration1 page")
	public void user_is_on_registration1_page() {
		commonsteps_action.goToUrl("https://parabank.parasoft.com/parabank/register.htm");
	}
	@When("user enters Registration data from given sheetname {string} and Rownumber {int}")
	public void user_enters_registration_data_from_given_sheetname_and_Rownumber(String SheetName, Integer RowNumber) throws IOException, InvalidFormatException {
		List<Map<String,String>> testdata = excelreader.getData( "C:\\Users\\bhoga\\OneDrive\\Desktop\\registerA.xlsx", SheetName);
		String FN = testdata.get(RowNumber).get("FirstName");
		String LN = testdata.get(RowNumber).get("LastName");
		String AD = testdata.get(RowNumber).get("Address");
		String City = testdata.get(RowNumber).get("City");
		String State = testdata.get(RowNumber).get("State");
		String ZipCode = testdata.get(RowNumber).get("ZipCode");
		String PH = testdata.get(RowNumber).get("Phone");
		String SSN = testdata.get(RowNumber).get("SSN");
		String UN = testdata.get(RowNumber).get("Username");
		String PW = testdata.get(RowNumber).get("Password");
		String CM = testdata.get(RowNumber).get("Confirm");
		
		registerpage_action.AddFirstName(FN);
		registerpage_action.AddLastName(LN);
		registerpage_action.AddAddress(AD);
		registerpage_action.AddCity(City);
		registerpage_action.AddState(State);
		registerpage_action.AddZipCode(ZipCode);
		registerpage_action.AddPhone(PH);
		registerpage_action.AddSSN(SSN);
		registerpage_action.AddUsername(UN);
		registerpage_action.AddPassword(PW);
		registerpage_action.AddConfirm(CM);
	}
	@When("click on Register1 button")
	public void click_on_register1_button() throws InterruptedException {
	registerpage_action.clickRegister();
		
		Thread.sleep(1000);
	}

	@Then("user should be land on home page1")
	public void user_should_be_land_on_home_page1() {
	   
	}
}
