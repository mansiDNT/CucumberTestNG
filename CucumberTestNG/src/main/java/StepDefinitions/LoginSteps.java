package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {
	WebDriver driver;
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPS\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>");
	    //throw new PendingException();
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@And("^click on login button$")
	public void click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@Then("^user is navigated to homepage$")
	public void user_is_navigated_to_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
}
