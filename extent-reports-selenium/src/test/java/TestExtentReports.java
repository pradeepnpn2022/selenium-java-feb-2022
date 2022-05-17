import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestExtentReports {
	WebDriver driver;
	ExtentSparkReporter spark;
	ExtentReports extent;
	ExtentTest test;
	ExtentTest test1;
	@BeforeClass
	public void setup() {
		
		driver = WebDriverManager.chromedriver().create();
		
		spark = new ExtentSparkReporter(System.getProperty("user.dir")+File.separator+"reports"+File.separator+"myReport.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		
		spark.config().setDocumentTitle("Document Title");
		spark.config().setReportName("My Report");
		spark.config().setTheme(Theme.STANDARD);
	}
	
	@Test(priority=1)
	public void test() {
		
		test = extent.createTest("This is my Test");
		test.log(Status.INFO, "The test case execution started!!");
		System.out.println("Hello!! This is my own test case");
		test.log(Status.INFO, "The test case execution is over!!");
		test.pass("The test case have been passed!!");
	}
	
	@Test(priority = 2)
	public void test1() {
		
		test1 = extent.createTest("This is my second test");
		
		test1.log(Status.INFO, "Execution have started");
		System.out.println("This is second test added by me");
		test1.log(Status.WARNING, "Something is wrong with this test");
		test1.fail("The test case have failed");
		
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
		extent.flush();
	}

}
