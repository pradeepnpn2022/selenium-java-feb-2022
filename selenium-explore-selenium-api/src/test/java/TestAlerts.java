import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAlerts {
	
	WebDriver driver;
	@BeforeClass
	public void chromeSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
	}
	
	@Test
	public void testAlerts() throws InterruptedException {
		driver.get("https://www.learning.npntraining.com/selenium-practice/dialogs/alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("feedback")).click();
		
		Alert test = driver.switchTo().alert();
		System.out.println("The alert text is :: " +test.getText());
		
		Thread.sleep(5000);
		
		Assert.assertEquals(test.getText(), "Thanks for ur feedback");
		
		test.accept();
	}
	@Test
	public void testHtmlAlert() throws InterruptedException {
		driver.get("https://www.learning.npntraining.com/selenium-practice/webcontrols/alerts_example.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("#bootStrapAlertExample .btn-info")).click();
		Thread.sleep(5000);
		WebElement htmlAlert = driver.findElement(By.id("bootStrapAlert"));
		
		Assert.assertTrue(htmlAlert.isDisplayed());
		
		String htmlAlertText = htmlAlert.getText();
		
		System.out.println("The alert text is :: " + htmlAlertText);
		
		Assert.assertEquals(htmlAlertText, "This is alert using just html.");
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("#bootStrapAlertExample .btn-close")).click();
		
	}

}
