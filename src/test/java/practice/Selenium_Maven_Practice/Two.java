package practice.Selenium_Maven_Practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Two {
	
	//SoftAssert sa = new SoftAssert();
	
	@Test(priority=4)
	public void D() {
		
		System.out.println("started D method");
		Assert.assertEquals("sakthi", "sakth");
		System.out.println("D method");
		
		
	}
	
	@Test(priority=5)
	public void E() {
		
		System.out.println("started E method");
		Assert.assertEquals("sakthi", "sakth");
		
		System.out.println("E method");
		
	}

	@Test(priority=6)
	public void F() {
	System.out.println("F method");
	
	}
	

}
