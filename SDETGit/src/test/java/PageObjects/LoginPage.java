package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	//Use Constructor to use this Page class driver in Step Def.
	public LoginPage(WebDriver driver) //Step def look for Driver object when you use 
	{
		this.driver=driver;  //Use this Driver which is defined in this class
	}
	//storing inputting locators 
	By txt_username = By.id("user-name");
	By txt_password = By.id("password");
	By btn_submit = By.id("login-button");
	By lbl_logo = By.xpath("//div[@class='app_logo']");
			
	
	//Method for enter login
	public void enterUsername(String username) 
	{
		driver.findElement(txt_username).sendKeys(username);		
	}
	public void enterPassword(String password) 
	{
		driver.findElement(txt_password).sendKeys(password);		
	}
	public void clickLogin() 
	{
		driver.findElement(btn_submit).click();		
	}
	//login with valid user
	public void userlogin(String username, String password)
	{
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_submit).click();
	}
			
	public void isApplogodisplayed()
	{
		driver.findElement(lbl_logo).isDisplayed();
	}
	
	
			
	

}
