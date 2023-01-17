import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Chrome webdriver => driver directory
		// webdriver.chrome.driver => D:\chromedriver_win32\chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "D:\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		// Create driver object for the Chrome browser
		WebDriver gcDriver = new ChromeDriver();
	
		gcDriver.get("https://bjitgroup.com/");
		
		// Get the Title of the website
		System.out.println(gcDriver.getTitle());
				
	}

}
