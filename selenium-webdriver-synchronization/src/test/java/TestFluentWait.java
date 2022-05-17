import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFluentWait {
	
	WebDriver driver;

	@BeforeClass
	public void chromeSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
	}
	@Test
	public void testFluentWait() {
		driver.get("https://www.learning.npntraining.com/selenium-practice/waits/ExplicitWait/TextBox_Wait.html");
		driver.manage().window().maximize();
		
		Wait <WebDriver> wait = new FluentWait<WebDriver>(driver)
									.withTimeout(Duration.ofSeconds(15))
									.pollingEvery(Duration.ofSeconds(5));
		
		By firstLocator = By.id("buggy1");
		By secondLocator = By.id("buggy2");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstLocator));
		driver.findElement(firstLocator).sendKeys("Hello");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(secondLocator));
		driver.findElement(secondLocator).sendKeys("How are you?");
									
	}
	

}
