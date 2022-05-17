import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFileUpload {
	
	WebDriver driver;
	@BeforeClass
	public void chromeSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
//	@Test
	public void simpleFileUpload() throws InterruptedException {
		driver.get("https://www.learning.npntraining.com/selenium-practice/fileupload.html");
		Thread.sleep(5000);
		driver.findElement(By.id("myFile")).sendKeys("C:\\Users\\win 10\\Desktop\\[Selenium] Locators.pdf");
	}
	@Test
	public void robotFileUpload() throws AWTException, InterruptedException {
		driver.get("https://www.filemail.com/share/upload-file");
		driver.findElement(By.id("addBtn")).click();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("document.getElementById('myFile').click();");
		Thread.sleep(5000);

		Robot robot = new Robot();
		StringSelection ss = new StringSelection("C:\\Users\\win 10\\Desktop\\[Selenium] Locators.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
