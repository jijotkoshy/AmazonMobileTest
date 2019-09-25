package com.appium.test.mobiletesting;

import com.appium.test.utils.CommonUtils;

import ObjectMap.AmazonObjectMap;

public class PurchaseItem extends CommonUtils{

	public void AddToCart() throws InterruptedException {
		Thread.sleep(4000);
		scrollVerticalBottonToUp(2);
		clickOnElement(findElementWhenReady(AmazonObjectMap.Amazon_ALLBUYINGOPTION_ACC));
		clickOnElement(findElementWhenReady(AmazonObjectMap.Amazon_ADDTOCART_XPATH));
		clickOnElement(findElementWhenReady(AmazonObjectMap.Amazon_CART_ACC));
	}
}
