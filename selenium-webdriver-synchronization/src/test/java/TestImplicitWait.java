import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestImplicitWait {
	
	WebDriver driver;
	@BeforeClass
	public void chromeSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
	}
	@Test
	public void testImplicitWait() {
		driver.get("https://www.learning.npntraining.com/selenium-practice/waits/ImplicitWait/RetrievingDetailsWithLoading.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("myButton")).click();
		Assert.assertEquals(driver.findElement(By.id("result")).getText(), "Hello");
		
		
	}

}
