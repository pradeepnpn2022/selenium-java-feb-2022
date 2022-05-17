package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {
	
	@Test(dataProvider = "test")
	public void test(int number, String name) {
		System.out.println("The number is :: "+number);
		System.out.println("The name is :: "+name);
	}
	
	@DataProvider(name = "test")
	public Object[][] dataProvider() {
		Object[][] test = {{1, "MyName"}, {2, "Your Name"}};
		return test;
	}

}
