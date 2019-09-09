package com.qa.page;

import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBaseAdvanced;

public class HomepageAdvanced extends TestBaseAdvanced{

	public HomepageAdvanced() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
}