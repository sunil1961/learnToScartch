package ProjectSupportSelenium.ProjectSupportSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class GoogleHomePageTest extends Base {
	WebDriver driver;
	
	@BeforeTest
	public void openBrowser() throws InterruptedException {
		driver=intializeDriver();
	}

	@Test
	public void launchGooglePage() {
		driver.get("https://www.google.co.in/");
		Assert.assertTrue(false);
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
