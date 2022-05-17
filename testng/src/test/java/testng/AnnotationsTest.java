package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationsTest {
	
	
	
	@Test(priority=3)
	public void test() {
		System.out.println("This is test method");
	}
	
	@BeforeClass
	public void beforeClassTest() {
		System.out.println("This is before class");
	}  
	
	@AfterClass
	public void afterClassTest() {
		System.out.println("This is after class");
	}
	
	@Test(priority=2)
	public void test1() {
		System.out.println("This is test1 method");
	} 
	@Test(priority=1)
	public void test2() {
		System.out.println("This is test2 method");
	}

}
