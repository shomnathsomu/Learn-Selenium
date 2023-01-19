import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Webdrivers\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://login.salesforce.com/"); 
		
		// Locator identifiers
		// ID/ ClassName/ Name/
		driver.findElement(By.id("username")).sendKeys("shomnathsomu");
		driver.findElement(By.name("pw")).sendKeys("1234567890");
		
		// Create the Xpath for the Login button
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		
		// Create the CSS selector for the text link
		//driver.findElement(By.cssSelector("#forgot_password_link")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"un\"]")).sendKeys("shomnath.pramanik@bjitgroup.com");
		//driver.findElement(By.cssSelector("#continue")).click();
		
		/*
		// Classes should not have spaces - Compound classes cannot be accepted
		driver.findElement(By.className("button r4 wide primary")).click();
		*/
		
		// Validate the error message from the Form fields
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
	}

}
