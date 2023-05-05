package myTestSuite;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {
	
	@Test
	public void Test1() {
		System.out.println("Hello from day1, test1!");
	}
	
	@BeforeTest
	public void Test2() {
		System.out.println("==========Day1============");
		System.out.println("I will execute first from day1 test2!");
	}
	
	@BeforeSuite
	public void PrefaceSuite() {
		System.out.println("Hello from BeforeSuite annotation class day1.");
	}
	
	@Test(groups = {"Regression"})
	public void GroupTest3() {
		System.out.println("This is GroupTest3 method on Day1!");
	}
}
