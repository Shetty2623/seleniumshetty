package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample {
	@Test
	public void launch() {
		Reporter.log("sample class executed", true);
	}
}
