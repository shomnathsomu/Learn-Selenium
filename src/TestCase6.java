import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCase6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		
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
		driver.findElement(By.xpath("//*[@id=\"login1\"]")).sendKeys("shomnathcse@gmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("123455");
		driver.findElement(By.xpath("//input[contains(@class, \"signinbtn\")]")).click();
		
		// Validate the error message from the Form fields
		System.out.println(driver.findElement(By.xpath("//*[@id=\"div_login_error\"]/b")).getText());
	}

}
