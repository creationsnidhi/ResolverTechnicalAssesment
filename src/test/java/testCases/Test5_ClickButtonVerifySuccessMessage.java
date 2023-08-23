package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;

@Test
public class Test5_ClickButtonVerifySuccessMessage extends BaseClass {

	HomePage homepage = new HomePage(driver);

	public void buttonVerification() throws InterruptedException {
		String url = System.getProperty("user.dir")+"/url/QE-index.html";
		driver.get(url);
		// logger.info("Open the URL...");
		System.out.println("Open the URL...");

		Thread.sleep(5000);
		homepage.scrollPageToTest5();

		WebElement btn = new WebDriverWait(driver, Duration.ofSeconds(100))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='test5-button']")));
		btn.click();

		String actValue = "You clicked a button!";
		Assert.assertEquals(actValue, homepage.verifymsg());
		System.out.println("success message is displayed...");

		Thread.sleep(5000);
		
		Assert.assertTrue(btn.getAttribute("disabled") != null, "Button is not disabled as expected.");
		
	}

}
