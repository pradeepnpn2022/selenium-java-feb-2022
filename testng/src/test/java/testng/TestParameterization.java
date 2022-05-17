package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameterization {
	
	//parameters
	@Test
	@Parameters({"number", "name"})
	public void test(int number, String name) {
		System.out.println("The number is :: " +number);
		System.out.println("The name is :: " +name );
	}  

}
