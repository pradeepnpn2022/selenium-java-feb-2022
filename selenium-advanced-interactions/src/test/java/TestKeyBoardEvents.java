import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestKeyBoardEvents {
	
	WebDriver driver;
	@BeforeClass
	public void chromeSetup() {
		System.setProperty("webdriver.chrome.driver", "F:\\NPN-Selenium\\Selenium-Java-Feb-2022\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	@Test
	public void testKeyboardEvents() {
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.id("email"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(userName)
				.keyDown(Keys.SHIFT)
				.sendKeys("hello")
				.keyUp(Keys.SHIFT)
				.sendKeys(" how are you?")
				.perform();
	}

}
