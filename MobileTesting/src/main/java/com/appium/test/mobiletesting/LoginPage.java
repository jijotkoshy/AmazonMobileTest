package com.appium.test.mobiletesting;

import org.testng.Reporter;

import com.appium.test.utils.CommonUtils;
import ObjectMap.AmazonObjectMap;
/**
 * 
 * @author Jijo
 *
 */
public class LoginPage  extends CommonUtils  {
	
		public void loginToAmazonApp() throws InterruptedException{
			clickOnElement(findElementWhenReady(AmazonObjectMap.Amazon_EXISTINGSIGNIN_XPATH));
			enterText(findElementWhenReady(AmazonObjectMap.Amazon_LOGINTEXTBOX_XPATH), "amazonqatestwipro@gmail.com");
			enterText(findElementWhenReady(AmazonObjectMap.Amazon_PASSWORDTEXTBOX_XPATH), "amazonqatest");
			System.out.println("Enter Login details");
			Reporter.log("Enter Login details");
			hideKeyboard();
			clickOnElement(findElementWhenReady(AmazonObjectMap.Amazon_SIGNIN_ACC));
			System.out.println("Sign In button Clicked");
			Reporter.log("Sign In button Clicked");
			Thread.sleep(10000);
	}
		
		
}