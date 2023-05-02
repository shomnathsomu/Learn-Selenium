import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCase11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		
//		driver.get("https://www.wego.com.bd/flights");
//		
//		driver.findElement(By.className("dvaNnCiBXb6dFdBLR8Re")).click();
//		for(int i=0; i<8; i++) {
//			driver.findElement(By.className("gvC_jym6919cQYQsoZjp")).click();
//		}
//		driver.findElement(By.xpath("//div[@class='rovA_SwrnFH2dnQRwDcv']/button")).click();
		
		// go to the website
		driver.get("https://www.easemytrip.com/flights.html");
		
		// Click on the from city drop-down
		driver.findElement(By.id("frmcity")).click();
		Thread.sleep(2000);
		// Parent-Child relationship locator to Identify the objects Uniquely
		driver.findElement(By.xpath("//div[@id='fromautoFill'] //span[@id='spn6']")).click();
		// Click on the To city drop-down
		driver.findElement(By.id("tocity")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='toautoFill'] //span[@id='spn2']")).click();
		
		driver.findElement(By.id("dvfarecal")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='dvcalendar']/div/div[1]/div/div[3]/ul/li[3]")).click();
		
		// Handle the latest drop-down looping UI
		// Click on the TRAVELLER & CLASS drop-down
		driver.findElement(By.id("trvlr_colm")).click();
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
		// Select 4 adults
		for (int i = 0; i < 3; i++) {
			driver.findElement(By.xpath("//div[@id='field1']/button[2]")).click();
		}
		// Reduce 1 adult
		driver.findElement(By.xpath("//div[@id='field1']/button[1]")).click();
		
		// Select 2 infants
		for (int i = 0; i < 4; i++) {
			driver.findElement(By.xpath("//div[@id='field3']/button[2]")).click();
		}
		
		// Handling Java alerts
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		// Select the business class radio button
		driver.findElement(By.id("lbBusiness")).click();
		
		// Confirm the TRAVELLERS & CLASS
		driver.findElement(By.id("traveLer")).click();
		
		driver.findElement(By.xpath("//button[@class='srchBtnSe']")).click();
		
		// Print the traveler number with text
		//System.out.println(driver.findElement(By.id("ptravlrNo")).getText());
		
		//driver.close();
		
	}

}