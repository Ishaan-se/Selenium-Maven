package day17;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PageFaktory {
	
	WebDriver driver; // global
	// Constructor
	
	PageFaktory(WebDriver driver) //chrome,edge
	
	{
		this.driver = driver;
	PageFactory.initElements(driver, this);
	}

	
	// Locate Elements
	
	@FindBy (css = "img[@alt='company-branding']" )
	WebElement logo;
	
	@FindBy (name = "username" )
	WebElement user_name;
	
//	@FindBy(how =How.NAME, using="username")
//	WebElement user_name;
	
	@FindBy (name = "password" )
	WebElement pass_word;
	
	@FindBy (xpath = "//button[normalize-space()='Login']" )
	WebElement clickButton;

	
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
