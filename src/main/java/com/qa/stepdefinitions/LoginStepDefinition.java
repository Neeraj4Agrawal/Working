package com.qa.stepdefinitions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.base.TestBase;
import com.qa.page.HomePage;
import com.qa.page.LoginPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition extends TestBase {

	

	@Given("^Initialize resources in the beginning of each scenario for Logins$")
	public void initialize_resources_in_the_beginning_of_each_scenario_for_Logins() throws Throwable {
		TestBase.initialization();

	}

	@Then("^Do enter the valid username and password and click$")
	public void do_enter_the_valid_username_and_password_and_click() throws Throwable {
		LoginPage lp = new LoginPage();
		lp.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^Verify the Tilte on home page$")
	public void Verify_the_Tilte_on_home_page() throws Throwable {
		HomePage homepage = new HomePage();
		String actual =homepage.verifyHomePageTitle();
		Assert.assertEquals("CRM", actual);
	}

}
