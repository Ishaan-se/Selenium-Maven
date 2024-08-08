	package day11;
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

	public class HeadlessTestingDemo {

		public static void main(String[] args) throws InterruptedException {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("headless=new");
			ChromeDriver driver = new ChromeDriver(options); 	//Open the browser
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(3000);
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");		
			driver.findElement(By.className("oxd-button")).click();
			String act_title = driver.getTitle();
			String expected_title = "OrangeHRM";
			if(act_title.equals(expected_title)) 
				System.out.println("PASS");
			else
				System.out.println("FAIL");

		}

	}
	


