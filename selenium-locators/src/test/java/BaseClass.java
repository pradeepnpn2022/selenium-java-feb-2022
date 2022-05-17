import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	WebDriver driver;
	
	public WebDriver setupChrome() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\NPN-Selenium\\Selenium-Java-Feb-2022\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
		}

}
