package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;

@Test
public class Test6_WebTable extends BaseClass {
	HomePage homepage=new HomePage(driver);
	public void webTable() throws InterruptedException {
		String url = System.getProperty("user.dir")+"/url/QE-index.html";
		driver.get(url);
		// logger.info("Open the URL...");
		System.out.println("Open the URL...");
		
         homepage.scrollPageToTest6();
		System.out.println("value of the cell at coordinates 2 , 2 : " + valueOfCell(2,2));//find the value of the cell at coordinates 2, 2
		
		String actualValue ="Ventosanzap";
		Assert.assertEquals(actualValue, valueOfCell(3,3),"cell value is Ventosanzap as expected");
		System.out.println(valueOfCell(3,3)+ " : " + "cell value is Ventosanzap as expected");
		
		
	}
	private String valueOfCell(int xCoordinates, int yCoordinates) {
		int columns = driver.findElements(By.xpath("//table[@class='table table-bordered table-dark']//th")).size();
		int rows = driver.findElements(By.xpath("//table[@class=\"table table-bordered table-dark\"]//tr")).size();

		for (int i = 1; i < rows; i++) {
			for (int j = 1; j <= columns; j++) {
					if(i==xCoordinates && j==yCoordinates) {
						String value = driver
								.findElement(By.xpath("//table[@class='table table-bordered table-dark']/tbody/tr[" + xCoordinates + "]/td[" + yCoordinates + "]"))
								.getText();
						//System.out.println("value of the cell at coordinates" +xCoordinates+" , "+yCoordinates+ " : " + value);						
						return value;
					
				}
				
			}
		}
		
		return "No Match Found";
        
		}
}
