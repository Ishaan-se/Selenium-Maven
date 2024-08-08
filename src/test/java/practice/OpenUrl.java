package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrl {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.example.com");
		String pageTitle = driver.getTitle();
		System.out.println("Page Title: " + pageTitle);
		driver.quit();

	}

}
