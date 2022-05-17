import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestWebTable {
	
	WebDriver driver;
	@BeforeMethod
	public void chromeSetup() {
		System.setProperty("webdriver.chrome.driver", "F:\\NPN-Selenium\\Selenium-Java-Feb-2022\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	@Test
	public void testWebTable() {
		driver.get("https://www.learning.npntraining.com/selenium-practice/webcontrols/Table.html");
		driver.manage().window().maximize();
		List <WebElement> tableItems = driver.findElements(By.cssSelector("#student tbody tr td:nth-of-type(1)"));
		
		for (WebElement element : tableItems) {
			
			System.out.println(element.getText());
			
		}
	}

}
