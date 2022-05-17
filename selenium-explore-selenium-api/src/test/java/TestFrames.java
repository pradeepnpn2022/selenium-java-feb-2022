import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFrames {

	WebDriver driver;
	@BeforeClass
	public void chromeSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Test
	public void testFrames() {
		driver.get("https://www.learning.npntraining.com/selenium-practice/selenium-api/1/IFrame-Main.html");
		driver.switchTo().frame("frame1");
		driver.findElement(By.cssSelector("#txtName1~#temp")).click();
//		Assert.assertEquals(driver.findElement(By.id("txtName1")).getText(), "30c");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.cssSelector("#txtName2~#temp")).click();
	}
}
