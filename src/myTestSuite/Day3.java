package myTestSuite;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@Test(timeOut = 10000)
	public void MobileTest() {
		System.out.println("Day 3: This is MobileTest method!");
	}
	
	@Parameters({ "AmazonHome", "Login/Username" })
	@Test
	public void UrlTest(String urlName, String userName) {
		System.out.println("Day 3: This is UrlTest method!");
		System.out.println("Website: " + urlName);
		System.out.println("Username: " + userName);
	}
	
	// enabled is used to skip a test case intentionally
	@Test(enabled = false)
	public void AutomationTest() {
		System.out.println("Day 3: This is MobileTest method!");
	}
	
	@Test(groups = {"Regression"})
	public void LaptopTest() {
		System.out.println("Day 3: This is LaptopTest method!");
	}
	
	@Test(dependsOnMethods = {"MobileTest"})
	public void ApiLogin() {
		System.out.println("Day 3: This is ApiLogin method!");
	}
}
