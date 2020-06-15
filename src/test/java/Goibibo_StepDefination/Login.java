package Goibibo_StepDefination;

import org.junit.runner.RunWith;

import PageObject.GoibiboLandingPage;
import Resources.BrowserSelection;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class Login extends BrowserSelection{
	
	
	@Given("^the user is on the landing page of application$")
	public void LaunchBrowser() throws Throwable {
	    Driver=InitiateBrowser();
	    Driver.get(prop.getProperty("AppURL"));
	    Driver.manage().window().maximize();
	    Thread.sleep(5000);
	    
	}

	@When("^the user is trying with Valid Login credentials '' and ''$")
	public void ApplicationLogin() throws Throwable {
	  
	    GoibiboLandingPage GB= new GoibiboLandingPage(Driver);
	    
	}

	@Then("^The user is able to login\\.$")
	public void ValidateLogin() throws Throwable {
	  
	    
	}
	

}
