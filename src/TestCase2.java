import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {

	public static void main(String[] args) {
		
		// Firefox webdriver => driver directory
		// webdriver.gecko.driver => D:\\Webdrivers\\geckodriver-v0.32.0-win64\\geckodriver.exe
		System.setProperty("webdriver.gecko.driver", "D:\\Webdrivers\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		
		// Create driver object for the Firefox browser
		WebDriver ffDriver = new FirefoxDriver();
		
		ffDriver.get("https://bjitgroup.com/");
		
		// Get the Title of the website
		System.out.println(ffDriver.getTitle());
	}

}
