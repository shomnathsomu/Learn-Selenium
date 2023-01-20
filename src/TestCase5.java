import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		// Locator identifiers
		// ID/ ClassName/ Name/
		driver.findElement(By.id("username")).sendKeys("shomnathsomu");
		driver.findElement(By.name("pw")).sendKeys("1234567890");
		
		// Create customised Xpath from HTML attributes for the Login button
		driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();
		
		// Create customised CSS from HTML attributes for the Login button
	}

}
