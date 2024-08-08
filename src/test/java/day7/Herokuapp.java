package day7;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Herokuapp {

		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://the-internet.herokuapp.com/iframe");
			Thread.sleep(3000);
			WebElement frame = driver.findElement(By.xpath("//*[@id=\"mce_0_ifr\"]"));
			driver.switchTo().frame(frame);
			WebElement content = driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p"));
			System.out.println(content.getText());
			String s = "Your content goes here.";
			if(s.equals(content.getText()))
					System.out.println("TRUE");
			else
				System.out.println("FALSE");
			driver.close();
		}
}
