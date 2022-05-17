import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestTag extends BaseClass{
	
	@Test
	public void testTag() {
		setupChrome();
		driver.get("https://facebook.com");
		WebElement pageFooter = driver.findElement(By.cssSelector("[data-testid=\"page_footer\"]"));
		
		List<WebElement> list = pageFooter.findElements(By.tagName("a"));
		
		for (WebElement element : list) {
			System.out.println(element.getText());
		}
	} 

}
