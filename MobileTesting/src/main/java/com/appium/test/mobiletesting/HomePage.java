package com.appium.test.mobiletesting;

import org.testng.Assert;
import org.testng.Reporter;

import com.appium.test.utils.CommonUtils;

import ObjectMap.AmazonObjectMap;
import io.appium.java_client.android.AndroidKeyCode;

public class HomePage extends CommonUtils{

	
	public void ClickOnMenuOption() throws InterruptedException {
		Assert.assertTrue(ValidateLogin());
		clickOnElement(findElementWhenReady(AmazonObjectMap.Amazon_MENU_XPATH));
	}
	
	private boolean ValidateLogin() {
		if(findElementWhenReady(AmazonObjectMap.Amazon_HEADER_XPATH) != null)
		{
			System.out.println("Login Successfull");
			Reporter.log("Login Successfull");
			return true;
		} else {
			System.out.println("Login Failed");
			Reporter.log("Login Failed");
			return false;
		}
	}
	
	public void SearchItem(String data) throws InterruptedException {
		clickOnElement(findElementWhenReady(AmazonObjectMap.Amazon_SEARCHTEXTBOX_XPATH));
		enterText(findElementWhenReady(AmazonObjectMap.Amazon_SEARCHTEXTBOX_XPATH), data);
		driver.pressKeyCode(AndroidKeyCode.ENTER);
		Thread.sleep(5000);
		scrollVerticalBottonToUp(4);
		Thread.sleep(3000);
		tapOnElement();
		Thread.sleep(6000);	
	}
}