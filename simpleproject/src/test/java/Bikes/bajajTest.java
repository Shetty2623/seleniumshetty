package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class bajajTest {
	@Test
	public void launch() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bajajauto.com/");
		Reporter.log("bajaj launched sucessfully", true);
		Reporter.log(" bajaj launched",true);
	}
}
