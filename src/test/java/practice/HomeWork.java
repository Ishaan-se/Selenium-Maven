package practice;

public class HomeWork {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		List<WebElement>links=driver.findElements(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		System.out.println("the total no of size: " + links.size());
		for (WebElement option : links) {
		    System.out.println(option.getText());
		        if(option.getText().equals("Selenium")||option.getText().equals("Selenium in biology"))
		        {
		        
		        option.click();
		        //breaking the loop
		        break;

	}

}
