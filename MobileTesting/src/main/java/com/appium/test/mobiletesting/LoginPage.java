package com.appium.test.mobiletesting;

import com.appium.test.utils.CommonUtils;
import ObjectMap.AmazonObjectMap;

public class LoginPage  extends CommonUtils  {
	
		public void loginToAmazonApp() throws InterruptedException{
			clickOnElement(findElementWhenReady(AmazonObjectMap.Amazon_EXISTINGSIGNIN_XPATH));
			enterText(findElementWhenReady(AmazonObjectMap.Amazon_LOGINTEXTBOX_XPATH), "amazonqatestwipro@gmail.com");
			enterText(findElementWhenReady(AmazonObjectMap.Amazon_PASSWORDTEXTBOX_XPATH), "amazonqatest");
			hideKeyboard();
			clickOnElement(findElementWhenReady(AmazonObjectMap.Amazon_SIGNIN_ACC));
			Thread.sleep(10000);
	}
		
		
}