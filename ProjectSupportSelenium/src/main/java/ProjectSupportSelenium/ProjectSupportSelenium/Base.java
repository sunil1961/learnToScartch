package ProjectSupportSelenium.ProjectSupportSelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.commons.io.FileUtils;


public class Base {
	 WebDriver driver;
	
	public WebDriver intializeDriver() {
		
		    System.setProperty("webdriver.chrome.driver", ".\\Resource\\chromedriver.exe");
		  //System.setProperty("webdriver.gecko.driver",".\\Resource\\GeckoDriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("start-maximized");
			driver = new ChromeDriver(chromeOptions);
			return driver;
	}
	
	
	public String getScreenShot(String testScreenName,WebDriver driver) {
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String filePath=System.getProperty("user.dir")+"\\reports\\"+ testScreenName+".png";
		File dFile=new File(filePath);
		try {
			FileUtils.copyFile(srcFile, dFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	return filePath; 	
	}

}
