import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
				
		// Locator identifiers
		// Xpath/ Css
		
		// Xpath format for Regular Expression: //tagName[contains(@attribute, 'value')]
		driver.findElement(By.xpath("//*[@type=\"email\"]")).sendKeys("shomnath@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name, \"pw\")]")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[contains(@value, \"Log In\")]")).click();
		
		// Xpath format for Regular Expression: //tagName[attribute*='value']

	}

}
