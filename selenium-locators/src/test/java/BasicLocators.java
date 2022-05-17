import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BasicLocators {
	
	WebDriver driver;
	@Test
	public void testLocators() {
		System.setProperty("webdriver.gecko.driver", "F:\\NPN-Selenium\\Selenium-Java-Feb-2022\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		WebElement userNameTxt = driver.findElement(By.id("email"));
		userNameTxt.clear();
		userNameTxt.sendKeys("test@test.com");
		
	}

}
