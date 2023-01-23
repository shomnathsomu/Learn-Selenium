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
		// Xpath/ Css
		
		// Xpath format: //tagName=[@attribute='value']
		
		/*
		//Create customized Xpath from HTML attributes
		driver.findElement(By.xpath("//*[@type=\"email\"]")).sendKeys("shomnath@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"pw\"]")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();
		*/
		
		//cssSelector format: tagName=[attribute='value']
		//cssSelector format(if tagName has an id): tagName#idValue or #idValue
		//cssSelector format(if tagName has a class): tagName.classValue
		
		// Create customized CSS from HTML attributes
		driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("shomnath@gmail.com");
		driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("12314546");
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
	}

}
