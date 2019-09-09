package com.qa.page;




import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;



public class HomePage extends TestBase {

	

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
