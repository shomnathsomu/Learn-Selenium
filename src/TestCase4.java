import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Webdrivers\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		/*
		driver.get("https://login.salesforce.com/"); 
		
		// Locator identifiers
		// ID/ ClassName/ Name/
		driver.findElement(By.id("username")).sendKeys("shomnathsomu");
		driver.findElement(By.name("pw")).sendKeys("1234567890");
		driver.findElement(By.className("button r4 wide primary")).click();
		*/
		
		driver.get("https://www.hackerrank.com/auth/login");
		
		driver.findElement(By.className("input")).sendKeys("shomnathsomu");
		
		//driver.close();
	}

}
