package day4;

import org.openqa.selenium.firefox.FirefoxDriver;

public class VadaPavada {
		//NO ELEMENT
		public static void main(String[] args) throws InterruptedException {

			FirefoxDriver driver = new FirefoxDriver();
			// Navigate to the URL with basic authentication
			driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
			Thread.sleep(3000);
			driver.close();
	}
}
