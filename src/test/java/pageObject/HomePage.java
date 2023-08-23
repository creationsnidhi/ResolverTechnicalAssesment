package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	public WebDriver ldriver;

	public HomePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(id = "inputEmail")
	@CacheLookup
	WebElement txtEmailAddress;

	@FindBy(id = "inputPassword")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "*//button[@class='btn btn-lg btn-primary btn-block']")
	@CacheLookup
	WebElement btnSignIn;

	@FindBy(xpath = "*//ul//li[@class='list-group-item justify-content-between']")
	@CacheLookup
	List<WebElement> listgroup;

	@FindBy(xpath = "//button[@id='dropdownMenuButton']")
	@CacheLookup
	WebElement dropdown;
	
	@FindBy(xpath = "*//div/a[3]")
	@CacheLookup
	WebElement option3;
	
	@FindBy(xpath="//h1[contains(text(),'Test 3')]")
	@CacheLookup
	WebElement test3;

	@FindBy(xpath="//h1[contains(text(),'Test 4')]")
	@CacheLookup
	WebElement test4;

	@FindBy(xpath = "//div[@id='test-4-div']//button[@class='btn btn-lg btn-primary']")
	@CacheLookup
	WebElement btnFirstEnable;

	@FindBy(xpath = "//div[@id='test-4-div']//button[@class='btn btn-lg btn-secondary']")
	@CacheLookup
	WebElement btnSecondDisabled;
	
	@FindBy(xpath="//h1[contains(text(),'Test 5')]")
	@CacheLookup
	WebElement test5;

	@FindBy(xpath = "//button[@id='test5-button']")
	@CacheLookup
	WebElement btn;

	@FindBy(xpath = "//div[normalize-space(text())='You clicked a button!']")
	@CacheLookup
	WebElement msgToster;
	
	@FindBy(xpath="//h1[contains(text(),'Test 6')]")
	@CacheLookup
	WebElement test6;

	public boolean txtEmailPresent() {

		return txtEmailAddress.isDisplayed();
	}

	public boolean txtPasswordPresent() {
		return txtPassword.isDisplayed();
	}

	public boolean btnSignInPresent() {

		return btnSignIn.isDisplayed();
	}

	public void setEmailAddress(String emailid) {
		txtEmailAddress.clear();
		txtEmailAddress.sendKeys(emailid);
	}

	public void setPassword(String password) {
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}

	public void clickSignIn() {
		btnSignIn.click();
	}

	public int totalValuefromListGroup() {

		int countlist = listgroup.size();
		return countlist;

	}

	public boolean verifyListGroupcount() {

		int count = totalValuefromListGroup();
		if (count == 3) {
			return true;
		}

		return false;
	}

	public String option1DefaultSelected() {

		String defaultSelectedText = dropdown.getText();
		return defaultSelectedText;
	}
	
	public void scrollPageToTest3() {
		Actions a = new Actions(ldriver);
		a.scrollToElement(test3);
		
	}

	public void clickDropdown() {
		dropdown.click();
	}
	
	public void clickOption3() {
		option3.click();
	}
	
	public void scrollPageToTest4() {
		Actions a = new Actions(ldriver);
		a.scrollToElement(test4);
		
	}

	public boolean isbtnEnable() {

		return btnFirstEnable.isEnabled();
	}

	public boolean isbtnDisabled() {

		return btnSecondDisabled.getAttribute("disabled") != null;
	}

	public void scrollPageToTest5() {
		Actions a = new Actions(ldriver);
		a.scrollToElement(test5);
		
	}
	public String verifymsg() {

		return msgToster.getText();
	}
	
	public void scrollPageToTest6() {
		Actions a = new Actions(ldriver);
		a.scrollToElement(test6);
		
	}

}
