package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTest {
	WebDriver driver;
	@BeforeClass
	public void chromeSetup() {
		System.setProperty("webdriver.chrome.driver", "F:\\NPN-Selenium\\Selenium-Java-Feb-2022\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	} 
	
	@Test
	public void facebookTest() {
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		String currentTitle = driver.getTitle();
		String expectedTitle = "Facebook – log in or sign up";
		
		Assert.assertEquals(currentTitle, expectedTitle);
		}
	@AfterClass
	public void tearDown() {
		driver.close();
//		driver.quit();
	}

}
