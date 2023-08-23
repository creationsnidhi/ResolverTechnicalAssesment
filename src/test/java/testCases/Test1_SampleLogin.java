package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;

@Test
public class Test1_SampleLogin extends BaseClass {

	public void signIn() {

		String url = System.getProperty("user.dir") + "/url/QE-index.html";
		driver.get(url);
		System.out.println("Open the URL...");

		HomePage homepage = new HomePage(driver);
		Assert.assertEquals(true, homepage.txtEmailPresent());
		Assert.assertEquals(true, homepage.txtPasswordPresent());
		Assert.assertEquals(true, homepage.btnSignInPresent());
		System.out.println("Verify Email Address testbox displyed...");
		homepage.setEmailAddress("creations.nidhi@gmail.com");
		homepage.setPassword("1234");
		homepage.clickSignIn();

	}
}
