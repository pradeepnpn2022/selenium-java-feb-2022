import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestLinkedIn {
	
	WebDriver driver;
	@Test
	public void testLinkedIn() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\NPN-Selenium\\Selenium-Java-Feb-2022\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://linkedin.com");
		driver.manage().window().maximize();
		Thread.sleep(10);
//		driver.findElement(By.cssSelector("form button[data-tracking-control-name='homepage-basic_google-sign-in-button']")).click();
		driver.findElement(By.xpath("//*[@data-test-id=\"nav-logo\"]")).click();
	}

}
