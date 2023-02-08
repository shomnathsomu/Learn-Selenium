import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/practice-project");
		
		// Traverse to the sibling element using Xpath
		driver.findElement(By.xpath("//div[@class='header-upper']/div/div/div[2]/nav/div[2]/ul/li[3]/following-sibling::li[2]/a")).click();
		
		// Traverse to the parent element using Xpath
		driver.findElement(By.xpath("//div[@class='header-upper']/div/div/div[2]/nav/div[2]/ul/li[3]/parent::ul/li[1]")).click();
		
		// Identifying objects with Text using Xpath locators
		driver.findElement(By.xpath("//*[text()='JOIN NOW']")).click();
		driver.findElement(By.xpath("//*[text()='Log in']")).click();
		
	}

}
