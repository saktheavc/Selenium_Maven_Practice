package practice.Selenium_Maven_Practice;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class One {
	
	@Test(priority=1)
	public void A() {
		
		
		System.out.println("A method");
		
	}
	
	@Test(priority=2)
	public void B() {
		
		System.out.println("B method");
		
	}

	@Test(priority=3)
	public void C() {
	System.out.println("C method");
	
	}
	

}
