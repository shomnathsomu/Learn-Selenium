import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.gecko.driver", "D:\\Webdrivers\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "D:\\Webdrivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// handling static dropdown with select webdriver API
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		
		s.selectByValue("option2");
		
		// index starts from 1, not like array index 0
		//s.selectByIndex(3);
		
		s.selectByVisibleText("Option3");
	}

}
