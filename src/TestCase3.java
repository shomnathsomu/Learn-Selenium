import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\\\Webdrivers\\\\geckodriver-v0.32.0-win64\\\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		// Locator identifiers
		// ID/ ClassName/ Name/ linkText/ Xpath/ Css
		driver.findElement(By.id("email")).sendKeys("harrypotter@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("1234567890");
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		// Create an object of a class
		//Method1 method1 = new Method1();
		
		// pass the parameters of the methods
		//System.out.println(method1.sum(1000, 111));
		
		//driver.close();

		//driver.get("https://www.hackerrank.com/auth/login");
		
		// multiple values - Selenium identifies the first one = scans from the top left
		//driver.findElement(By.className("input")).sendKeys("shomnathsomu");
		
		//driver.close();
	}

}
