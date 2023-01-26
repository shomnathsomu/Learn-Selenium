import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		
		// Locator identifiers
		// Xpath/ Css
		
		// Xpath format for Regular Expression: //tagName[contains(@attribute, 'value')]
		
		
		// cssSelector format for Regular Expression: 
		// tagName[attribute*='value']
		// tagName#id
		// tagName.classname
		
		// Customized xpath and css practices
		// Created customized Xpath and cssSelector with regular expressions
		driver.findElement(By.cssSelector("a[title*=\"Sign in\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"login1\"]")).sendKeys("shomnathsomu");
		driver.findElement(By.cssSelector("input#password")).sendKeys("123455");
		driver.findElement(By.xpath("//input[contains(@class, \"signin\")]")).click();
		

	}

}
