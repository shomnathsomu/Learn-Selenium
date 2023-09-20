import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Chrome webdriver => driver directory
		// webdriver.chrome.driver => D:\chromedriver_win32\chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "D:\\Webdrivers\\chromedriver-win64\\chromedriver.exe");
		
		// Create driver object for the Chrome browser
		WebDriver driver = new ChromeDriver();
	
		//driver.get("https://bjitgroup.com/");
		driver.get("https://login.salesforce.com/");
		
		//System.out.println(driver.getTitle()); // validate if your Page title is correct
		
		//System.out.println(driver.getCurrentUrl()); // validate if you are landed on the correct URL
		
		//System.out.println(driver.getPageSource()); // print the page source code
		
		driver.get("https://www.spacex.com/");
		Thread.sleep(10000);
		
		driver.navigate().back();
		//driver.navigate().forward();
		
		//driver.close(); // it closes the current browser only
		//driver.quit(); // it closes all the browsers opened by Selenium script

	}

}
