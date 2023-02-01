import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//driver.findElement(By.xpath("//div[@class='gb_Ve']/div[1]/div/div/a/svg")).click();
		driver.findElement(By.cssSelector("#gbwa > div > a > svg")).click();
	}

}
