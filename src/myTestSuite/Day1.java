package myTestSuite;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day1 {
	
	@Test(dataProvider = "getData")
	public void Test1(String username, String password) {
		System.out.println("Day 1: Username Password");
		System.out.println("Day 1: " + username + " " + password);
	}
	
	@BeforeTest
	public void Test() {
		System.out.println("Day 1: I will execute first from day1 test2!");
	}
	
	@BeforeSuite
	public void PrefaceSuite() {
		System.out.println("Day 1: Hello from BeforeSuite annotation class day1.");
	}
	
	@Test(groups = {"Regression"})
	public void GroupTest() {
		System.out.println("Day 1: This is group method on Day1!");
		Assert.assertTrue(false); // to make a Test Case failed forcefully
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		
		data[0][0] = "Alex";
		data[0][1] = "12345";
		
		data[1][0] = "Robert";
		data[1][1] = "12345";
		
		data[2][0] = "Tom";
		data[2][1] = "12345";
		
		return data;
	}
}
