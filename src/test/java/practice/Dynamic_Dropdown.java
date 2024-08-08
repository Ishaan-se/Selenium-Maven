		package practice;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Dynamic_Dropdown {
		    public static void main(String[] args) throws InterruptedException {
		       ChromeDriver driver = new ChromeDriver();
		        driver.get("https://www.bing.com");

		        // Locate and interact with the dynamic dropdown (e.g., search box suggestions)
		        WebElement searchBox = driver.findElement(By.name("q"));
		        searchBox.sendKeys("Selenium WebDriver");

		        // Wait for the suggestions to appear
		        Thread.sleep(2000);

		        // Locate and click on a suggestion
		        WebElement suggestion = driver.findElement(By.xpath("//li[@class='sa_sg']//span[contains(text(), 'selenium webdriver')]"));
		        suggestion.click();
		        Thread.sleep(2000);
		        // Verify the search results page
		        if (driver.getTitle().contains("Selenium WebDriver")) {
		            System.out.println("Dynamic dropdown handled successfully.");
		        } else {
		            System.out.println("Failed to handle dynamic dropdown.");
		        }

		        driver.quit();
		    }
		}

