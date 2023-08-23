package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;

@Test
public class Test4_ButtonEnableAndDisable extends BaseClass {

	HomePage homepage = new HomePage(driver);

	public void verifybutton() throws InterruptedException {
		String url = System.getProperty("user.dir") + "/url/QE-index.html";
		driver.get(url);
		System.out.println("Open the URL...");

		homepage.scrollPageToTest4();
		Assert.assertEquals(true, homepage.isbtnEnable(), " Verified first button is enabled...");
		System.out.println(" Verify first button is enabled...");
		Assert.assertEquals(true, homepage.isbtnDisabled(), "Verified second button is disabled...");
		System.out.println(" Verify second button is disabled...");
	}

}
