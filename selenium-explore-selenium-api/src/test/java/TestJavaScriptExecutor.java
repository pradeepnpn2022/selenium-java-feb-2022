import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestJavaScriptExecutor {
	
	WebDriver driver;
	@BeforeClass
	public void chromeSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test
	public void testJSExecutor() {
		driver.get("https://facebook.com");
		
		WebElement email = driver.findElement(By.id("email"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
//		js.executeScript("alert('Welcome to NPN Training');");
		js.executeScript("arguments[0].style.border='3px solid red'", email);
		
	}

}
