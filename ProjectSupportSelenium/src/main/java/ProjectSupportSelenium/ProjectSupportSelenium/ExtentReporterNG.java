package ProjectSupportSelenium.ProjectSupportSelenium;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	static ExtentReports extent;
	static ExtentSparkReporter extentSparkReporter;
	
	public static ExtentReports extentReportGenerator() {
		
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		extentSparkReporter = new ExtentSparkReporter(path);
		extentSparkReporter.config().setReportName("Web Automation Reporter");
		extentSparkReporter.config().setDocumentTitle("Test Result");
		extent=new ExtentReports();
		extent.attachReporter(extentSparkReporter);
		extent.setSystemInfo("Tester","Sunil");
		return extent;
	}

}
