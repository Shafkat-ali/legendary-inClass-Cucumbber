package stepDef;

import org.junit.runner.RunWith;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import cucumber.api.junit.Cucumber;
import utilities.ConfigurationReader;
import utilities.Driver;

public class stepDefinition {

	@Given("^Navigate to \"([^\"]*)\"$")
	public void navigate_to(String arg1) {
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
	}

	@When("^Login using valid Credentials provided$")
	public void login_using_valid_Credentials_provided() {
	    
	}

	@When("^Validate you're logged in by verifying \"([^\"]*)\"$")
	public void validate_you_re_logged_in_by_verifying(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 3");
	}

	@Then("^Click on ADMIN to navigate to the page$")
	public void click_on_ADMIN_to_navigate_to_the_page(){
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 4");
	}

	@Then("^Click checkbox for \"([^\"]*)\"$")
	public void click_checkbox_for(String arg1)  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 5");
	}

	@Then("^Click DELETE$")
	public void click_DELETE() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 6");
	}

	@Then("^Click OK on the popup window$")
	public void click_OK_on_the_popup_window() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 7");
	}

	@Then("^Verify there is no \"([^\"]*)\" under username column$")
	public void verify_there_is_no_under_username_column(String arg1)  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 8");
	}

	@Then("^Logout$")
	public void logout()  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 9");
	}


}