package myTestSuite;

import org.testng.annotations.Test;

public class Day3 {
	
	@Test
	public void GroupTest1() {
		System.out.println("This is GroupTest1 method! on Day3");
	}
	
	@Test(groups = {"Regression"})
	public void GroupTest2() {
		System.out.println("This is GroupTest2 method! on Day3");
	}
}
