package myTestSuite;

import org.testng.annotations.Test;

public class NavList {

	@Test
	public void Flight() {
		System.out.println("This is flight method!");
	}
	
	@Test
	public void Hotel() {
		System.out.println("This is hotel method!");
	}
	
	@Test
	public void HotelBooking() {
		System.out.println("This is hotel booking method!");
	}
	
	@Test
	public void Train() {
		System.out.println("This is Train method!");
	}
	
}
