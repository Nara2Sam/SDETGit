package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageFactory.homePageFactory;
import PageFactory.loginPageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageFactoryLoginSteoDefinition {

	static WebDriver driver;
	loginPageFactory login;  // reference variable of login page factory
	homePageFactory home; //reference variable of Home page variable

	@Given("User is on Login Page")
	public void user_is_on_login_Page() {
		// write code
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		driver.get("https://www.saucedemo.com/v1");
		// throw new io.cucumber.java.PendingException();
	}

	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) throws InterruptedException {
		// write code
		login = new loginPageFactory(driver); // object for Pafactory
		login.enterUsername(username);
		login.enterPassword(password);

		// throw new io.cucumber.java.PendingException();
	}

	@And("Clicks on login button")
	public void clicks_on_login_button() {
		login.clickLogin();
	}

	@Then("User is navigated to Home page")
	public void user_is_navigated_to_Home_page() {
		home = new homePageFactory(driver); //object of home page factory
		home.isCartDisplayed();
	}

	@And("Close the browser")
	public void close_the_browser() {
		// write code

		driver.quit();
		// throw new io.cucumber.java.PendingException();
	}

}
