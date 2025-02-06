package ExtentReports;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import net.bytebuddy.asm.Advice.Local;

public class ToLearnExtentReports {
	@Test
	public void createReport() {
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		// step1:create an instance of extentsparkreporter
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_reports/" + timestamp + ".html");

		// step2:create an instance ExtentReports
		ExtentReports extReport = new ExtentReports();

		// step3:attach ExtentSparkReporter to extentREports
		extReport.attachReporter(spark);

		// step4:create an instance of ExtentTest
		ExtentTest test = extReport.createTest("create Report");

		// step5: create call log() to provide status and message
		test.log(Status.PASS, "message added into report");

		// step6: call flush
		extReport.flush();
	}
}
