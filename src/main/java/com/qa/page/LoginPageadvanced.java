package com.qa.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBaseAdvanced;

public class LoginPageadvanced extends TestBaseAdvanced{

	// Page Factory - OR:
	@FindBy(name = "email")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = ".//*[@id='ui']/div/div/form/div/div[3]")
	WebElement loginBtn;

	

	// Initializing the Page Objects:
	public LoginPageadvanced() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	                                                              
                                                                    
	public HomepageAdvanced login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		// loginBtn.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);

		return new HomepageAdvanced();
	}

/*	public void enterTextInTextBox(String objLocator, String testdata) {
		enterText(objLocator, testdata);
	}
	
	
	public void clickElement(String objLocator) {
		click(objLocator);
	}
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
}

