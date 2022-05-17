import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBMI  {
	WebDriver driver;
	@BeforeClass
	public void chromeSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.learning.npntraining.com/selenium-practice/BMI-Calculator.html");
		
	}
	@Test(dataProvider = "myDataProvider") 
	public void testBMI(String heightValue, String weightValue, String bmiValue, String bmiMeaning) throws IOException, InterruptedException {
		
		WebElement height = driver.findElement(By.name("height"));
		WebElement weight = driver.findElement(By.name("weight"));
		WebElement calculateBMI = driver.findElement(By.id("calculate"));
		WebElement bmi = driver.findElement(By.name("bmi"));
		WebElement meaning = driver.findElement(By.name("meaning"));
		WebElement resetBtn = driver.findElement(By.cssSelector("input[value=\"Reset\"]"));
		height.clear();
		height.sendKeys(heightValue);
		weight.clear();
		weight.sendKeys(weightValue);
		calculateBMI.click();
		Thread.sleep(5000);
		Assert.assertEquals(bmi.getAttribute("value"), bmiValue);
		Assert.assertEquals(meaning.getAttribute("value"), bmiMeaning);
		
		resetBtn.click();
		Thread.sleep(5000);
		
	}
	@DataProvider(name="myDataProvider")
	public String[][] getTestData() throws IOException {
		ExcelReader excel = new ExcelReader();
		return excel.getExcelData();
	}

}
