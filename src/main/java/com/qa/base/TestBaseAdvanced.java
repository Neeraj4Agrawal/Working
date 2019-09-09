package com.qa.base;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.qa.resources.ReadSources;
import com.qa.util.PathContantAdvanced;
import com.qa.util.TestUtil;

public class TestBaseAdvanced {
	private static ReadSources readResources;
	public  static Map<String, String> readConfigData;
	private static Map<String, String> readEnvironmentUrls;
	public static WebDriver driver;
	private static long timeout = PathContantAdvanced.defaultTimeout;
    
	public TestBaseAdvanced() {
		readResources = new ReadSources();
		readConfigData = readResources.getValuesFromXml("LoginPage.xml", "loginObjectRepository");
	}

	public static ReadSources getReadResources() {
		return readResources;
	}

/*	public static void main(String[] args) {
		/*
		 * TestBaseAdvanced tb= new TestBaseAdvanced();
		 * 
		 * readEnvironmentUrls=tb.getReadResources().getValuesFromXml("LoginPage.xml",
		 * "loginObjectRepository"); System.out.println("Value of the xpath is ==    "+
		 * readEnvironmentUrls.get("loginEmail"));
		 */
//		System.out.println(TestBaseAdvanced.readConfigData.get("logo"));
//	} 


	public static void initialization() {
		
		TestBaseAdvanced tb = new TestBaseAdvanced();

		readEnvironmentUrls = TestBaseAdvanced.getReadResources().getValuesFromXml("LoginPage.xml", "loginObjectRepository");
		String browserName = readEnvironmentUrls.get("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Bridesides\\FreeCRMCucumberFramework\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(readEnvironmentUrls.get("url"));

	}

	public static WebDriver getWebDriver() {
		return driver;
	}
	
	public static long getTimeout() {
		return timeout;
	}
	
	
	
	
	
	
}
