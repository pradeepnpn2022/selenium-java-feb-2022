import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DropdownTestOne {
	
	WebDriver driver;
	@BeforeClass
	public void chromeSetup() {
		System.setProperty("webdriver.chrome.driver", "F:\\NPN-Selenium\\Selenium-Java-Feb-2022\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	} 
	
	@Test(priority = 1)
	public void testDropDownOne() throws InterruptedException {
		driver.get("https://www.learning.npntraining.com/selenium-practice/webcontrols/DropDown.html");
		driver.manage().window().maximize();
		Assert.assertEquals("User Experience", driver.getTitle());	//Proper page validation
		WebElement dropDown = driver.findElement(By.id("userexp"));
		WebElement result = driver.findElement(By.id("result"));
		Select select = new Select(dropDown);
		
		select.selectByIndex(1); //Select successfull calls
		
		Assert.assertEquals("1", result.getText());	//Assertion for successfull calls
		
		select.selectByValue("total_call_drops");	//Select Total Call Drops
		
		Assert.assertEquals("2", result.getText()); //Assertion for Total Call Drops
		
		Thread.sleep(10);
		
		
	} 
	@Test(priority = 2)
	public void testDropDownTwo() {
		WebElement dropDownBtn = driver.findElement(By.id("dropdownMenuButton"));
		dropDownBtn.click();
		List <WebElement> dropDownList = driver.findElements(By.cssSelector(".dropdown-menu li"));
		for (WebElement element : dropDownList) {
			if(element.getText().equals("home")) {
				element.click();
			}
		}
	} 

}
