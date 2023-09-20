package myTestSuite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class E2Esearch {
	
	@Test
	public void TestCase1() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Webdrivers\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gozayaan.com/");
		
		// Explicitly wait for the element to be click-able
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement roundWayRadio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='searchbar']/div[3]/div[1]/label[2]/span[contains(text(),'Round Way')]")));
        roundWayRadio.click();
        
        driver.findElement(By.xpath("//div[@id='searchbar']/div[3]/div[2]/div/span[contains(text(),'From')]")).click();
        
        WebElement fromCity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='airport-suggestion'] //div[contains(text(),'CXB')]")));
        fromCity.click();
        
        WebElement toCity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='airport-suggestion'] //div[contains(text(), 'JFK')]")));
        toCity.click();
        
        WebElement journeyDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='calendar left'] //span[@class='day selected']")));
        journeyDate.click();
        
        // Move the mouse cursor to the specific element
        Actions actions = new Actions(driver);
        WebElement hoverReturnDate = driver.findElement(By.xpath("//div[@class='calendar right'] //span[contains(text(), '30')]"));
        actions.moveToElement(hoverReturnDate).perform();
        
        Thread.sleep(2000);
        WebElement returnDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='calendar right'] //span[@class='day shadow-range shadow-range-end']")));
        returnDate.click();
        
        WebElement travelerClass = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.box.traveler")));
        travelerClass.click();
        
        // Choose adults
        driver.findElement(By.xpath("//div[@id='guestPicker']/div[2]/div[1]/div[2]/button[2]")).click();
        
        // Choose children
        driver.findElement(By.xpath("//div[@id='guestPicker']/div[2]/div[2]/div[1]/div[2]/button[2]")).click();
       
        
        //driver.findElement(By.xpath("//select[@id='__BVID__131']")).click();
        Select s = new Select(driver.findElement(By.cssSelector("select.brand-input.small.custom-select")));
		s.selectByValue("3");
        
        // Choose infants
        driver.findElement(By.xpath("//div[@id='guestPicker']/div[2]/div[3]/div[2]/button[2]")).click();
        
        // Select traveler class
        WebElement tClass = driver.findElement(By.xpath("//div[@class='radio-container'] //span[contains(text(), 'Economy')]"));
        
        // Check if the radio button is already selected (optional)
        if (!tClass.isSelected()) {
        	tClass.click();
        }
        
        // Click the traveler Done button
        driver.findElement(By.xpath("//div[@id='guestPicker']/div[3]/div[3]/button")).click();
        
        driver.findElement(By.xpath("//div[@class='search-btn-container']/button")).click();
	}
}
