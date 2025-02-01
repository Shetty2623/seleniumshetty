package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sampleTest {
	@Test
	public void launch()
	{
	Reporter.log("executed",true);	
	}
}
//mvn test -Dtest=MavenParametersTest -Durl=https://demowebshop.tricentis.com/