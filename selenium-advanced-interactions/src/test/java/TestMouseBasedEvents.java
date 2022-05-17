import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestMouseBasedEvents {
	
	WebDriver driver;
	@BeforeClass
	public void chromeSetup() {
		System.setProperty("webdriver.chrome.driver", "F:\\NPN-Selenium\\Selenium-Java-Feb-2022\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
//	@Test
	public void testMouseBasedEvents() {
		driver.get("https://www.learning.npntraining.com/selenium-practice/actions/Droppable.html");
		driver.manage().window().maximize();
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions test = new Actions(driver);
		
//		test.moveToElement(source)
//			.clickAndHold()
//			.moveToElement(target)
//			.release()
//			.perform();
		
//		test.clickAndHold(source)
//			.release(target)
//			.perform();
		
		test.dragAndDrop(source, target).perform();
		
		test.moveToElement(source).clickAndHold().moveByOffset(-201, 0).release().perform();
		
		test.moveToElement(source).clic.moveByOffset(-201,0).click().build().perform();
		
		Assert.assertEquals(driver.findElement(By.cssSelector("#droppable p")).getText(), "Dropped!");
	}
//	@Test
	public void testDoubleClick() {
		driver.get("https://www.learning.npntraining.com/selenium-practice/actions/DoubleClick.html");
		driver.manage().window().maximize();
		WebElement clickMe = driver.findElement(By.name("dblClick"));
		
		Actions test = new Actions(driver);
//		test.moveToElement(clickMe)
//			.doubleClick()
//			.perform();
		
		test.doubleClick(clickMe).perform();
	}
	@Test
	public void testHoverMenu() throws InterruptedException {
		driver.get("https://www.learning.npntraining.com/selenium-practice/actions/MenuOptions.html");
		driver.manage().window().maximize();
		WebElement services = driver.findElement(By.id("services"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(services)
//				.click()
//				.perform();
		services.click();
		
		driver.findElement(By.linkText("Web Design")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.co.in/?gws_rd=ssl");
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.id("services")).click();
		driver.findElement(By.linkText("Web Development")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://in.search.yahoo.com/?fr2=inr");
		
		
			
	}

}
