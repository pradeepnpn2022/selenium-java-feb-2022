import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestExplicitWait {
	
	WebDriver driver;
	@BeforeClass
	public void chromeSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
	}
	@Test
	public void testExplicitWait() {
		driver.get("https://www.learning.npntraining.com/selenium-practice/waits/ExplicitWait/TextBox_Wait.html");
		driver.manage().window().maximize();
		WebDriverWait waitOne = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebDriverWait waitTwo = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		By firstLocator = By.id("buggy1");
		By secondLocator = By.id("buggy2");
		
		waitOne.until(ExpectedConditions.visibilityOfElementLocated(firstLocator));
		
		driver.findElement(firstLocator).sendKeys("Hello");
		
		waitTwo.until(ExpectedConditions.visibilityOfElementLocated(secondLocator));
		driver.findElement(secondLocator).sendKeys("How are you?");
	} 

}
