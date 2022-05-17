import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWindows {

	WebDriver driver;
	@BeforeClass
	public void chromeSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Test
	public void testWindows() throws InterruptedException {
		driver.get("https://www.learning.npntraining.com/selenium-practice/popups/Popup.html");
		String parentWindow = driver.getWindowHandle();
		
		System.out.println("Parent Window: " +parentWindow);
		WebElement help = driver.findElement(By.id("help"));
		WebElement chat = driver.findElement(By.id("chat"));
		
		help.click();
		chat.click();
		
		Set<String> currentWindowHandles = driver.getWindowHandles();
		
		for (String handle : currentWindowHandles) {
			System.out.println(handle);
		}
		
		Iterator<String> iter = currentWindowHandles.iterator();
		
		String homeWindow = iter.next();
		String chatWindow = iter.next();
		String helpWindow = iter.next();
			
		driver.switchTo().window(helpWindow);
		Thread.sleep(5000);
		Assert.assertEquals(driver.findElement(By.id("tt")).getText(), "We will assist you");
				
		driver.switchTo().window(chatWindow);
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(), "Chat Info");
	}

}
