package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;

@Test
public class Test3_SelectList extends BaseClass {
	HomePage homepage = new HomePage(driver);

	public void verifyOption1selectedByDefult() throws InterruptedException {
		String url = System.getProperty("user.dir") + "/url/QE-index.html";
		driver.get(url);
		System.out.println("Open the URL...");

		homepage.scrollPageToTest3();

		Assert.assertEquals("Option 1", homepage.option1DefaultSelected());
		System.out
				.println("assert that 'Option 1' is the default selected value: " + homepage.option1DefaultSelected());

		homepage.clickDropdown();
		homepage.clickOption3();

		System.out.println("Select Option 3 from dropdowm...");

	}
}
