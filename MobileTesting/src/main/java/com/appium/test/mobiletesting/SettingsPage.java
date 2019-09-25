package com.appium.test.mobiletesting;

import com.appium.test.utils.CommonUtils;

import ObjectMap.AmazonObjectMap;

public class SettingsPage extends CommonUtils{

public void changeLocation() throws InterruptedException {
	scrollVerticalBottonToUp();
	clickOnElement(findElementWhenReady(AmazonObjectMap.Amazon_SETTINGTAB_ACC));
	clickOnElement(findElementWhenReady(AmazonObjectMap.Amazon_COUNTRY_XPATH));
	clickOnElement(findElementWhenReady(AmazonObjectMap.Amazon_COUNTRYUS_XPATH));
	clickOnElement(findElementWhenReady(AmazonObjectMap.Amazon_COUNTRYAUS_ACC));
	Thread.sleep(2000);
	clickOnElement(findElementWhenReady(AmazonObjectMap.Amazon_COUNTRYDONEBUTTON_XPATH));
	}
}