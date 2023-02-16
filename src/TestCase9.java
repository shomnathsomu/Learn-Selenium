import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		//	CSS selectors locators
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("shomnathsomu"); // Using attribute and value
		driver.findElement(By.cssSelector("input#password")).sendKeys("123456"); // using ID
		driver.findElement(By.cssSelector("input.button.r4.wide.primary")).click(); // using Class
	}

}
