import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AirIndiaExample {
	
	WebDriver driver;
	@BeforeTest
	public void chromeSetup() {
		System.setProperty("webdriver.chrome.driver", "F:\\NPN-Selenium\\Selenium-Java-Feb-2022\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	@Test
	public void testAirIndia() throws InterruptedException {
		driver.get("https://www.airindia.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='oneway']//parent::div")).click();
		WebElement fromList = driver.findElement(By.id("from"));
		fromList.sendKeys("BENG");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(), 'Bengaluru, Kempegowda International Airport, BLR, India')]")).click();
		WebElement toList = driver.findElement(By.id("to"));
		toList.clear();
		toList.sendKeys("DELHI");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(), 'Delhi, Indira Gandhi International Airport, DEL, India')]")).click();
		WebElement dateInput = driver.findElement(By.id("_depdateeu1"));
		dateInput.click();
//		List <WebElement> aprilDates = driver.findElements(By.cssSelector(".ui-datepicker-group-first td a"));
//		
//		for (WebElement april : aprilDates) {
//			System.out.println(april.getText());
//			if(april.getText().equals("30") ) {
//				april.click();
//				break;
//		}
			
			do{
				Thread.sleep(2000);
				driver.findElement(By.cssSelector(".ui-datepicker-next")).click();
				
			} while(!driver.findElement(By.cssSelector(".ui-datepicker-group-first .ui-datepicker-month")).getText().equals("November"));
		
			List <WebElement> novemberDates = driver.findElements(By.cssSelector(".ui-datepicker-group-first td a"));
			
			for (WebElement november : novemberDates) {
				
				System.out.println(november.getText());
				if(november.getText().equals("15")) {
					november.click();
					break;
				}
				
			}
			
			Select adults = new Select(driver.findElement(By.id("ddladult1")));
			adults.selectByValue("2");
			
			Select children = new Select(driver.findElement(By.id("ddlchildren1")));
			children.selectByVisibleText("2");
			
			Select infants = new Select(driver.findElement(By.id("ddlinfants1")));
			infants.selectByVisibleText("2");
			
			Select type = new Select(driver.findElement(By.id("_classType1")));
			type.selectByValue("Business");
			
			driver.findElement(By.id("btnbooking")).click();


		
	} 

}
