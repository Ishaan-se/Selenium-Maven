		package practice;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;

		public class Dropdown {
		    public static void main(String[] args) {
		        ChromeDriver driver = new ChromeDriver();
		        driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");

		        // Locate the dropdown element
		        WebElement countryDropdown = driver.findElement(By.id("country"));

		        // Select an option from the dropdown by its visible text
		        Select select = new Select(countryDropdown);
		        select.selectByVisibleText("India");

		        // Print the selected option to the console
		        WebElement selectedOption = select.getFirstSelectedOption();
		        System.out.println("Selected option: " + selectedOption.getText());

		        driver.quit();
		    }
		
	}


