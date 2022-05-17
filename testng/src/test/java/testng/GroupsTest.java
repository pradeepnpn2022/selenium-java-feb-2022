package testng;

import org.testng.annotations.Test;

public class GroupsTest {
	
	@Test(groups = "Regression")
	public void test1() {
		System.out.println("This is test1");
	}
	@Test(groups = {"Acceptance", "Regression"})
	public void test2() {
		System.out.println("This is test2");
	}
	@Test(groups = {"Acceptance"})
	public void test3() {
		System.out.println("This is test3");
	}

}
