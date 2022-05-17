import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFileDownload {
	
	WebDriver driver;
	@BeforeClass
	public void chromeSetup() {
		WebDriverManager.chromedriver().setup();
		
		HashMap hm = new HashMap();
		hm.put("download.default_directory", "C:\\Users\\win 10\\Desktop");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", hm);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Test
	public void testDownloadFile() {
		driver.get("http://the-internet.herokuapp.com/download");
		driver.findElement(By.linkText("sample-zip-file.zip")).click();
	}

}
