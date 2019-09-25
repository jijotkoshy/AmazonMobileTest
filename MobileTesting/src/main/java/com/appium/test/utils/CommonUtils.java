package com.appium.test.utils;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import ObjectMap.AmazonObjectMap;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

/**
 * 
 * @author Jijo
 *
 */
public class CommonUtils extends BaseTest {
	
	public MobileElement findElementWhenReady(AmazonObjectMap mobileElement) {
		final String elementLocator = mobileElement.name();
		final String elementLocatorValue = mobileElement.getValue();
		MobileElement element = null;
				try {
					element = getMobileElement(elementLocator,elementLocatorValue);
					return element;
				} catch (Exception e) {
					System.out.println("Didnt find element after 60 seconds of wait");
			}
				return null;
	}
	
	private MobileElement getMobileElement(String elementLocator,String elementLocatorValue) {
		MobileElement isElementPresent = null;
		WebDriverWait wait = new WebDriverWait(driver, 60);
		if(elementLocator.contains("XPATH"))
			isElementPresent = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath(elementLocatorValue)));

		else if(elementLocator.contains("ID"))
			isElementPresent = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id(elementLocatorValue)));
		
		else if(elementLocator.contains("ACC"))
			isElementPresent = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId(elementLocatorValue)));
		
		return isElementPresent;
	}
	
	public void validateText(String actualText,String expectedText) {
		Assert.assertEquals(actualText, expectedText);
		System.out.println("Actual Result: "+actualText.trim()+" .Expected Result: "+expectedText.trim());
		Reporter.log("Actual Result: "+actualText.trim()+" .Expected Result: "+expectedText.trim());
	}
	
	public void clickOnElement(MobileElement mobileElement) {
		mobileElement.click();
	}
	
	public void enterText(MobileElement mobileElement, String data) {
		mobileElement.sendKeys(data);
	}
	
	public void hideKeyboard() {
		driver.hideKeyboard();
	}
	
	public void scrollVerticalBottonToUp() {
		Dimension dimensions = driver.manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.5;
		int scrollStart = screenHeightStart.intValue();
		Double screenHeightEnd = dimensions.getHeight() * 0.2;
		int scrollEnd = screenHeightEnd.intValue();
		driver.swipe(0,scrollStart,0,scrollEnd,2000);
	}
	
	public void scrollVerticalBottonToUp(int timesSwipe) {
		int count = 0;
		
		while(count<timesSwipe){
		Dimension dimensions = driver.manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.5;
		int scrollStart = screenHeightStart.intValue();
		Double screenHeightEnd = dimensions.getHeight() * 0.2;
		int scrollEnd = screenHeightEnd.intValue();
		driver.swipe(0,scrollStart,0,scrollEnd,2000);
		count++;
		}
	}
	
	public boolean waitForElementToBeClickable(AmazonObjectMap mobileElement) {
		final String elementLocator = mobileElement.name();
		final String elementLocatorValue = mobileElement.getValue();
		MobileElement element = null;
				try {
					element = getMobileElementIfClickable(elementLocator,elementLocatorValue);
					return true;
				} catch (Exception e) {
					System.out.println("Didnt find element after 60 seconds of wait");
			}
				return false;
	}
	
	private MobileElement getMobileElementIfClickable(String elementLocator,String elementLocatorValue) {
		MobileElement isElementPresent = null;
		WebDriverWait wait = new WebDriverWait(driver, 60);
		if(elementLocator.contains("XPATH"))
			isElementPresent = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath(elementLocatorValue)));

		else if(elementLocator.contains("ID"))
			isElementPresent = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id(elementLocatorValue)));
		
		else if(elementLocator.contains("ACC"))
			isElementPresent = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(elementLocatorValue)));
		
		return isElementPresent;
	}
	
	public void tapOnElement() {
//		Dimension dimensions = driver.manage().window().getSize();
//		Double y1 = dimensions.getHeight() * 0.5;
//		int y = y1.intValue();
//		Double x1 = dimensions.getWidth() * 0.5;
//		int x = x1.intValue();
//		driver.tap(1,x,y,1000);
		TouchAction a2 = new TouchAction(driver);
		a2.tap(300, 800).perform();
	}
	
//	MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("\nSee All Buying Options\n");
//	el7.click();
//	MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("$799.00");
//	el8.click();
//	MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("\n                      Add to Cart\n                      from seller ^Great^Deals and price $849.90\n                    ");
//	el9.click();
//	MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("Cart");
//	el10.click();

}


