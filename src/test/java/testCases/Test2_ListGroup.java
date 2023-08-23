package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;

@Test
public class Test2_ListGroup extends BaseClass {

	public void performActionOnListGroup() {
		String url = System.getProperty("user.dir") + "/url/QE-index.html";
		driver.get(url);
		System.out.println("Open the URL...");
		HomePage homepage = new HomePage(driver);

		Assert.assertEquals(homepage.totalValuefromListGroup(), 3);

		System.out.println("Verify there are three values in the listgroup:" + homepage.totalValuefromListGroup());

		WebElement secondListItem = driver.findElement(By.xpath("//ul[@class='list-group']/li[2]"));

		WebElement badgeElement = secondListItem
				.findElement(By.xpath(".//span[@class='badge badge-pill badge-primary']"));
		String badgeValue = badgeElement.getText();
		Assert.assertEquals("6", badgeValue);
		// logger.info("Verify second List Item badge value:" + badgeValue);
		System.out.println("Verify second List Item badge value:" + badgeValue);
	}

}
