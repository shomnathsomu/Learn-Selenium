package myTestSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Assignment {
	
	@Test
	public void AmazonSearch() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		
		driver.get("https://www.amazon.com/");
		
		// test case 01
		driver.findElement(By.id("nav-search-dropdown-card")).click();
		driver.findElement(By.xpath("//select[@id='searchDropdownBox']/option[contains(text(),'Software')]")).click();
		
		// test case 02
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("games");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		Thread.sleep(5000);
		// test case 03
		driver.quit();
		
	}
}
