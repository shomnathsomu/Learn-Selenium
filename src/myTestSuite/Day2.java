package myTestSuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

	@AfterTest
	public void Flight() {
		System.out.println("I will execute last in flight method!");
	}
	
	@Test
	public void Hotel() {
		System.out.println("This is hotel method!");
	}
	
	@BeforeTest
	public void HotelBooking() {
		System.out.println("==========Day2============");
		System.out.println("I will execute first in hotel booking method!");
	}
	
	@Test(groups = {"Regression"})
	public void Train() {
		System.out.println("This is Train method on Day2!");
	}
	
	@BeforeMethod
	public void Prerequisite() {
		System.out.println("I will execute before every method");
	}
	
	@AfterMethod
	public void Conclusion() {
		System.out.println("I will execute after every method");
	}
	@BeforeSuite
	public void PrefaceSuite() {
		System.out.println("Hello from BeforeSuite annotation class day2.");
	}
}
