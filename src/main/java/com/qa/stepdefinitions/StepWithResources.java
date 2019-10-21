package com.qa.stepdefinitions;

import java.util.Map;

import org.junit.Test;

import com.qa.base.TestBase;
import com.qa.base.TestBaseAdvanced;
import com.qa.page.LoginPageadvanced;
import com.qa.util.BaseUtilAdvanced;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class StepWithResources  extends TestBaseAdvanced {
	private  static Map<String, String> objectrepository;
//	TestBaseAdvanced tba= new TestBaseAdvanced();
//	BaseUtilAdvanced bta= new BaseUtilAdvanced();
	private LoginPagess loginpagess;
	@Given("^Initialize resources in the beginning of each scenario for Loginss$")
	public void initialize_resources_in_the_beginning_of_each_scenario_for_Logins() throws Throwable {
	//	TestBaseAdvanced tba= new TestBaseAdvanced();
		TestBaseAdvanced.initialization();
		objectrepository=TestBaseAdvanced.getReadResources().getValuesFromXml("LoginPage.xml", "loginObjectRepository");
		this.loginpagess= new LoginPagess();		 

	}
/*
@Then("^Do enter the valid username and password and clicks$")
	public void do_enter_the_valid_username_and_password_and_click() throws Throwable {
	System.out.print("So here the value for the user name "+objectrepository.get("username"));
	
	LoginPageadvanced lpa = new LoginPageadvanced();
	System.out.print("So here the value for the user name "+objectrepository.get("password"));
		lpa.login(objectrepository.get("username"), objectrepository.get("password"));
	}
*/	

	

@Then("^Do enter the valid username and password and clicks$")
public void do_enter_the_valid_username_and_password_and_click() throws Throwable {
	loginpagess.enterTextInTextBox(objectrepository.get("username_xpath"), objectrepository.get("username"));
}
	
}
