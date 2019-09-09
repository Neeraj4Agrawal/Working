package StepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	 WebDriver driver;
	 private Map<String, String> loginPageObjectRepo;
	 
	 @Given("^Initialize resources in the beginning of each scenario for Login$")
		public void Initialize_Resources() throws IOException, InterruptedException {
			
	//		loginPageObjectRepo = CrmTestBase.getReadResources().getValuesFromXml("LoginPage.xml", "loginObjectRepository");
		}
	 
	 
 
	 
	 
	 
@Given("^When user already on Login Page$")
public void user_already_on_login_page(){
System.setProperty("webdriver.chrome.driver","C:\\Bridesides\\FreeCRMCucumberFramework\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://ui.freecrm.com/");
}

@When("^title of the page is Free CRM$")
public void title_of_login_page_is_free_CRM(){
String title = driver.getTitle();
System.out.println(title);
//Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", title);
}	

@Then("^user enter the username and password$")
public void user_enters_username_and_password(DataTable credentials){
	List<List<String>> data =credentials.raw();
driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
}

@Then("^Close the driver$")
public void close_driver()
{
driver.quit();	
}







/*	
@Then("^user enters \"(.*)\" and \"(.*)\"$")
public void user_enters_username_and_password(String username, String password){
driver.findElement(By.name("email")).sendKeys(username);
driver.findElement(By.name("password")).sendKeys(password);
}

*/



}
