/*
package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class POMLoginSteoDefinition {
	static WebDriver driver;
	LoginPage login; // Reference variable of login page (PageObjectclass)

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
		login = new LoginPage(driver); // object of the page object class
	login.enterUsername(username);
	login.enterPassword(password);
	}		
		 //* //write code driver.findElement(By.id("user-name")).sendKeys(username);
		// * driver.findElement(By.id("password")).sendKeys(password); Thread.sleep(200);
		// throw new io.cucumber.java.PendingException();
	

	@And("Clicks on login button")
	public void clicks_on_login_button() {
		// write code
		login.clickLogin();
		// throw new io.cucumber.java.PendingException();
	}

	@Then("User is navigated to Home page")
	public void user_is_navigated_to_Home_page() {
	// write code
		// Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0,
		// "User has navigated to homepage");

		login.isApplogodisplayed();
		
	}

   @And("Close the browser")
	public void close_the_browser() {
		// write code

	driver.quit();
	// throw new io.cucumber.java.PendingException();
	}

}

*/