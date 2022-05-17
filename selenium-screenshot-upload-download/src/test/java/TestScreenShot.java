import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScreenShot {
	
	WebDriver driver;
	@BeforeClass
	public void fireFoxSetup() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Test
	public void takeScreenshot() throws IOException, InterruptedException {
		driver.get("https://facebook.com");
		Thread.sleep(5000);
		//Normal Screenshot
		TakesScreenshot screenShot = (TakesScreenshot)driver;
		File file = screenShot.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"\\screenshot\\test.png");
		FileUtils.copyFile(file, target);
		
		WebElement logo = driver.findElement(By.cssSelector(".fb_logo"));
		//Webelement screenshot
		File logoSource = logo.getScreenshotAs(OutputType.FILE);
		File logoTarget = new File(System.getProperty("user.dir")+"\\screenshot\\logo.png");
		FileUtils.copyFile(logoSource, logoTarget);
		//Full page screen shot (Only available in Firefox)
		File fullScreenSource = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		File fullScreenTarget = new File(System.getProperty("user.dir")+"\\screenshot\\full.png");
		FileUtils.copyFile(fullScreenSource, fullScreenTarget);
	}

}
