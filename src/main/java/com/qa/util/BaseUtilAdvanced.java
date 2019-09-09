package com.qa.util;


import java.time.Duration;
import java.util.List;




import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;

import org.openqa.selenium.support.ui.Wait;




import com.qa.base.TestBaseAdvanced;



public class BaseUtilAdvanced {

	
	public void click(String objLocator) {
		

		WebElement element = getElementAfterLoaded(objLocator);
		element.click();
		System.out.println("The Given Element is clicked");
	}
	 
	public void enterText(String objLocator, int index, String text) {
		

		WebElement element = getMultipleElementsAfterLoaded(objLocator).get(index);
		System.out.println("The data to be filled in the Textbox is " + text);
		element.clear();
		element.sendKeys(text);
		System.out.println("The data is entered to the Text Field");
	}
	public void enterText(String objLocator, String text) {
		

		WebElement element = getElementAfterLoaded(objLocator);
		System.out.println("The data to be filled in the Textbox is " + text);
		element.clear();
		element.sendKeys(text);
		System.out.println("The data is entered to the Text Field");
	}
	public WebElement getElementAfterLoaded(final String objLocator) {
	

		By byValue = getLocator(objLocator);
		isElementLoaded(byValue);
		return TestBaseAdvanced.getWebDriver().findElement(byValue);
	}
	
	public List<WebElement> getMultipleElementsAfterLoaded(final String objLocator) {
		System.out.println("Executing Test Step::" + new Object() {
		}.getClass().getEnclosingMethod().getName());
		By byValue = getLocator(objLocator);
		isElementLoaded(byValue);
		return TestBaseAdvanced.getWebDriver().findElements(byValue);
	}
	
	public boolean isElementLoaded(final By byValue) {
		

		System.out.println("Waiting for element to be loaded. Timeout:" + TestBaseAdvanced.getTimeout());
		Wait<WebDriver> gWait = new FluentWait<WebDriver>(TestBaseAdvanced.getWebDriver()).withTimeout(Duration.ofSeconds(TestBaseAdvanced.getTimeout())).pollingEvery(Duration.ofMillis(600))
				.ignoring(NoSuchElementException.class);
		ExpectedCondition<Boolean> condition = new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver d) {
				WebElement element = d.findElement(byValue);
				return element.isDisplayed();
			}
		};
		return gWait.until(condition);
	}
	
	public By getLocator(String objLocator) {
		
		String[] str = objLocator.split("===");
		System.out.println("Object Identifier " + str[0] + "\t Object Identifier Value " + str[1]);
		By byValue = null;
		switch (str[0].toUpperCase()) {
		case "ID":
			byValue = By.id(str[1]);
			break;
		case "XPATH":
			byValue = By.xpath(str[1]);
			break;
		case "NAME":
			byValue = By.name(str[1]);
			break;
		case "LINKTEXT":
			byValue = By.linkText(str[1]);
			break;
		case "CSS":
			byValue = By.cssSelector(str[1]);
			break;
		case "CLASSNAME":
			byValue = By.className(str[1]);
			break;
		case "TAGNAME":
			byValue = By.tagName(str[1]);
			break;
		}
		return byValue;
	}
	
	
	
	
}