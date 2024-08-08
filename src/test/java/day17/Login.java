package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver; // global
	// Constructor
	
	Login(WebDriver driver1) //chrome,edge
	
	{
		driver = driver1;	
	}
	
	// Locate Elements
	
	By logo = By.cssSelector("img[@alt='company-branding']");
	By user_name = By.name("username");
	By pass_word = By.name("password");
	By clickButton = By.xpath("//button[normalize-space()='Login']");
	
	//actions
	
	public void setUserName (String username)
	{
		driver.findElement(user_name).sendKeys(username);
	}
	
	public void setPassword (String password)
	{
		driver.findElement(pass_word).sendKeys(password);
	}
	
	public void clickSubmit ()
	{
		driver.findElement(clickButton).click();
	}	
		
	public boolean checkLogo()
	{
	boolean status = driver.findElement(logo).isDisplayed();
	return status;
		
	}
	
	
  @Test
  public void f() {
  }
}
