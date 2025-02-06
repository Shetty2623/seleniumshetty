package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class YamahaTest {
	@Test
	public void launch() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yamaha.com/en/");
		Reporter.log("yamaha launched sucessfully", true);
	}
}
