package nopcommerce;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_cases {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        
        // Maximizes the Window
        //driver.manage().window().maximize();
        
        // Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        
        // Check if the registration page is displayed
        boolean isRegisterPageDisplayed = driver.findElement(By.xpath("//h1[normalize-space()='Register']")).isDisplayed();
        System.out.println("Register Page Displayed: " + isRegisterPageDisplayed);

        // Check if personal details section is displayed
        boolean isPersonalDetailsDisplayed = driver.findElement(By.xpath("//strong[normalize-space()='Your Personal Details']")).isDisplayed();
        System.out.println("Personal Details Section Displayed: " + isPersonalDetailsDisplayed);

        // Select Gender
        WebElement maleRadioButton = driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@id='gender-female']"));

        System.out.println("Checking gender button");
       
        Thread.sleep(1000);
        femaleRadioButton.click();
        boolean isFemaleSelected = femaleRadioButton.isSelected();
        System.out.println("Female selected: " + isFemaleSelected);
        
        Thread.sleep(1000);
        maleRadioButton.click();
        boolean isMaleSelected = maleRadioButton.isSelected();
        System.out.println("Male selected: " + isMaleSelected);
        
        // Check if other elements are displayed
        boolean isGenderLabelDisplayed = driver.findElement(By.xpath("//label[normalize-space()='Gender:']")).isDisplayed();
        System.out.println("Gender Label Displayed: " + isGenderLabelDisplayed);

        boolean isFirstNameLabelDisplayed = driver.findElement(By.xpath("//label[normalize-space()='First name:']")).isDisplayed();
        System.out.println("First Name Label Displayed: " + isFirstNameLabelDisplayed);
        
        boolean isFirstNameTextboxEnabled = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
        System.out.println("First Name Textbox Enabled: " + isFirstNameTextboxEnabled);

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Ishaan");
 
        boolean isLastNameLabelDisplayed = driver.findElement(By.xpath("//label[normalize-space()='Last name:']")).isDisplayed();
        System.out.println("Last Name Label Displayed: " + isLastNameLabelDisplayed);

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Sehgal");
        
        // Date of Birth Dropdowns
        Thread.sleep(1000);
        WebElement dayDropdown = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        Select selectDay = new Select(dayDropdown);
        selectDay.selectByVisibleText("15"); // Selects 15th day
        boolean isDayDropdownDisplayed = dayDropdown.isDisplayed();
        boolean isDayDropdownEnabled = dayDropdown.isEnabled();
        System.out.println("Day Dropdown Displayed: " + isDayDropdownDisplayed);
        System.out.println("Day Dropdown Enabled: " + isDayDropdownEnabled);

        Thread.sleep(1000);
        WebElement monthDropdown = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        Select selectMonth = new Select(monthDropdown);
        selectMonth.selectByVisibleText("July"); // Selects July month
        boolean isMonthDropdownDisplayed = monthDropdown.isDisplayed();
        boolean isMonthDropdownEnabled = monthDropdown.isEnabled();
        System.out.println("Month Dropdown Displayed: " + isMonthDropdownDisplayed);
        System.out.println("Month Dropdown Enabled: " + isMonthDropdownEnabled);
        
        Thread.sleep(1000);
        WebElement yearDropdown = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        Select selectYear = new Select(yearDropdown);
        selectYear.selectByVisibleText("1990"); // Selects 1990 year
        boolean isYearDropdownDisplayed = yearDropdown.isDisplayed();
        boolean isYearDropdownEnabled = yearDropdown.isEnabled();
        System.out.println("Year Dropdown Displayed: " + isYearDropdownDisplayed);
        System.out.println("Year Dropdown Enabled: " + isYearDropdownEnabled);
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ishaan@gmail.com");

        boolean isCompanyDetailsDisplayed = driver.findElement(By.xpath("//strong[normalize-space()='Company Details']")).isDisplayed();
        System.out.println("Company Details Section Displayed: " + isCompanyDetailsDisplayed);

        boolean isCompanyNameLabelDisplayed = driver.findElement(By.xpath("//label[normalize-space()='Company name:']")).isDisplayed();
        System.out.println("Company Name Label Displayed: " + isCompanyNameLabelDisplayed);

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("Bebo Technologies");

        boolean isOptionsDisplayed = driver.findElement(By.xpath("//strong[normalize-space()='Options']")).isDisplayed();
        System.out.println("Options Section Displayed: " + isOptionsDisplayed);

        boolean isNewsletterLabelDisplayed = driver.findElement(By.xpath("//label[normalize-space()='Newsletter:']")).isDisplayed();
        System.out.println("Newsletter Label Displayed: " + isNewsletterLabelDisplayed);

        boolean isNewsletterCheckboxEnabled = driver.findElement(By.xpath("//input[@id='Newsletter']")).isEnabled();
        System.out.println("Newsletter Checkbox Enabled: " + isNewsletterCheckboxEnabled);

        boolean isPasswordSectionDisplayed = driver.findElement(By.xpath("//strong[normalize-space()='Your Password']")).isDisplayed();
        System.out.println("Password Section Displayed: " + isPasswordSectionDisplayed);

        boolean isPasswordLabelDisplayed = driver.findElement(By.xpath("//label[normalize-space()='Password:']")).isDisplayed();
        System.out.println("Password Label Displayed: " + isPasswordLabelDisplayed);

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("selenium123");

        boolean isConfirmPasswordLabelDisplayed = driver.findElement(By.xpath("//label[normalize-space()='Confirm password:']")).isDisplayed();
        System.out.println("Confirm Password Label Displayed: " + isConfirmPasswordLabelDisplayed);

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("selenium123");
        
        driver.findElement(By.xpath("//button[@id='register-button']")).click();

        // Additional checks and navigation
        WebElement footerInformation = driver.findElement(By.xpath("//div[@class='footer-block information']//div[@class='title']"));
        System.out.println("Footer Information Title: " + footerInformation.getText());

        driver.findElement(By.xpath("//a[normalize-space()='Sitemap']")).click();

        driver.findElement(By.xpath("//a[normalize-space()='Shipping & returns']")).click();

        driver.findElement(By.xpath("//a[normalize-space()='Conditions of Use']")).click();

        driver.findElement(By.xpath("//a[normalize-space()='About us']")).click();

        WebElement customerServiceTitle = driver.findElement(By.xpath("//div[@class='footer-block customer-service']//div[@class='title']"));
        System.out.println("Customer Service Title: " + customerServiceTitle.getText());

        driver.findElement(By.xpath("//a[normalize-space()='Search']")).click();
        
        driver.findElement(By.xpath("//a[normalize-space()='News']")).click();

        driver.findElement(By.xpath("//a[normalize-space()='Blog']")).click();

        driver.findElement(By.xpath("//a[normalize-space()='Recently viewed products']")).click();

        driver.findElement(By.xpath("//a[normalize-space()='Compare products list']")).click();

        driver.findElement(By.xpath("//a[normalize-space()='New products']")).click();

        WebElement myAccountTitle = driver.findElement(By.xpath("//div[@class='footer-block my-account']//div[@class='title']"));
        System.out.println("My Account Title: " + myAccountTitle.getText());

        driver.findElement(By.xpath("//a[normalize-space()='My account']")).click();

        driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();

        driver.findElement(By.xpath("//a[normalize-space()='Addresses']")).click();

        driver.findElement(By.xpath("//a[normalize-space()='Shopping cart']")).click();

        driver.findElement(By.xpath("//a[normalize-space()='Wishlist']")).click();

        driver.findElement(By.xpath("//a[normalize-space()='Apply for vendor account']")).click();

        boolean isFollowUsDisplayed = driver.findElement(By.xpath("//strong[normalize-space()='Follow us']")).isDisplayed();
        System.out.println("Follow Us Section Displayed: " + isFollowUsDisplayed);

        driver.findElement(By.xpath("//a[normalize-space()='Facebook']")).click();

        driver.findElement(By.xpath("//a[normalize-space()='Twitter']")).click();

        driver.findElement(By.xpath("//a[normalize-space()='YouTube']")).click();

        boolean isNewsletterDisplayed = driver.findElement(By.xpath("//strong[normalize-space()='Newsletter']")).isDisplayed();
        System.out.println("Newsletter Section Displayed: " + isNewsletterDisplayed);

        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='newsletter-email']")).sendKeys("ishaan@gmail.com");

        driver.findElement(By.xpath("//button[@id='newsletter-subscribe-button']")).click();

        boolean isFooterDisclaimerDisplayed = driver.findElement(By.xpath("//span[@class='footer-disclaimer']")).isDisplayed();
        System.out.println("Footer Disclaimer Displayed: " + isFooterDisclaimerDisplayed);

        System.out.println("Page Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Page Source Length: " + driver.getPageSource().length());
        System.out.println("Window Handle: " + driver.getWindowHandle());
        Thread.sleep(5000);
        
        // Close the browser
        driver.quit();
    }
}
