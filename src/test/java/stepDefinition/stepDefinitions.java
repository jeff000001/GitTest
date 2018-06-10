package stepDefinition;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;

@SuppressWarnings("unused")
@RunWith(Cucumber.class)
public class stepDefinitions {

    
	@Given("^validate the browser$")
    public void validate_the_browser() throws Throwable {
		System.out.println("Navigated to login url");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	System.out.println("Deciding browser is open");
    }

    @Then("^check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
    	System.out.println("Browser is started");
    }

	
	@Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        //code
    	System.out.println("Navigated to login url");
    }

    @When("^User loginto application with username and password$")
    public void user_loginto_application_with_username_and_password() throws Throwable {
    	//code
    	System.out.println("Logged in successfully");
    }

    @When("^User loginto application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_loginto_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    }
    
    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	//home page validation
    	System.out.println("Validated homepage");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	//validate number of cards
    	System.out.println("Cards validated");
    }

    @Then("^Cards are displayed are \"([^\"]*)\"$")
    public void cards_are_displayed_are(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println(arg1);
    }
    
    @When("^User signup with following details$")
    public void user_signup_with_following_details(DataTable data) throws Throwable {
        List<List<String>> obj=data.raw();
        System.out.println(obj.get(0).get(0));
        System.out.println(obj.get(0).get(1));
        System.out.println(obj.get(0).get(2));
        System.out.println(obj.get(0).get(3));
        System.out.println(obj.get(0).get(4));
    }
    
    @When("^User login to application with (.+) and (.+)$")
    public void user_login_to_application_with_and(String username, String password) throws Throwable {
    	System.out.println(username);
    	System.out.println(password);
    }
}