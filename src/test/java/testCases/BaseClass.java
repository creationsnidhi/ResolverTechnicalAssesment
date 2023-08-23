package testCases;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	WebDriver driver = new ChromeDriver();

	@BeforeClass
	public void setup() {

		System.setProperty("webdriver.gecko.driver", "./driver\\chromedriver.exe");
		System.out.println("open the chrome browse...");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("maximize the browser window...");

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
		// logger.info("close the browser...");
		System.out.println("close the browser...");

	}

}
