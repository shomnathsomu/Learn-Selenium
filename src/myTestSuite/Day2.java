package myTestSuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2 {

	@AfterTest
	public void Flight() {
		System.out.println("Day 2: I will execute last in flight method!");
	}
	
	@Parameters({ "Trip" })
	@Test
	public void Resort(String urlName) {
		System.out.println("Day 2: This is Resort method!");
		System.out.println(urlName);
	}
	
	@BeforeTest
	public void HotelBooking() {
		System.out.println("Day 2: I will execute first in hotel booking method!");
	}
	
	@Test(groups = {"Regression"})
	public void Train() {
		System.out.println("Day 2: This is Train method on Day2!");
	}
	
	@BeforeMethod
	public void Prerequisite() {
		System.out.println("Day 2: I will execute before every method");
	}
	
	@AfterMethod
	public void Conclusion() {
		System.out.println("Day 2: I will execute after every method");
	}
	@BeforeSuite
	public void PrefaceSuite() {
		System.out.println("Day 2: Hello from BeforeSuite annotation class day2.");
	}
}
