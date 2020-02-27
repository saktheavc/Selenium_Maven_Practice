package practice.Selenium_Maven_Practice;

import org.testng.annotations.Test;

public class Two {
	
	@Test(priority=4)
	public void D() {
		
		System.out.println("D method");
		
	}
	
	@Test(priority=5)
	public void E() {
		
		System.out.println("E method");
		
	}

	@Test(priority=6)
	public void F() {
	System.out.println("F method");
	
	}
	

}
