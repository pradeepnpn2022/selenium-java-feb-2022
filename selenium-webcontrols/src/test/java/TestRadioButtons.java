import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestRadioButtons {
	
	WebDriver driver;
	@BeforeClass
	public void chromeSetup() {
		System.setProperty("webdriver.chrome.driver", "F:\\NPN-Selenium\\Selenium-Java-Feb-2022\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	} 
	
	@Test
	public void testRadioButtons() {
		driver.get("https://www.learning.npntraining.com/selenium-practice/webcontrols/RadioButton.html");
		driver.manage().window().maximize();
		
		Assert.assertTrue(driver.findElement(By.cssSelector("input[value='puc']")).isSelected());
				
		WebElement sslc = driver.findElement(By.cssSelector("input[value='sslc']"));
		if(!sslc.isSelected()) {
			sslc.click();			
		}
	}

}
