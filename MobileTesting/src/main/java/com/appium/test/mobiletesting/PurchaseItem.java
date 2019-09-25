package com.appium.test.mobiletesting;

import org.testng.Reporter;

import com.appium.test.utils.CommonUtils;

import ObjectMap.AmazonObjectMap;
/**
 * 
 * @author Jijo
 *
 */
public class PurchaseItem extends CommonUtils{

	public void AddToCart() throws InterruptedException {
		Thread.sleep(4000);
		scrollVerticalBottonToUp(2);
		clickOnElement(findElementWhenReady(AmazonObjectMap.Amazon_ALLBUYINGOPTION_ACC));
		clickOnElement(findElementWhenReady(AmazonObjectMap.Amazon_ADDTOCART_XPATH));
		System.out.println("Added to cart");
		Reporter.log("Added to cart");
		clickOnElement(findElementWhenReady(AmazonObjectMap.Amazon_CART_ACC));
		System.out.println("Inside Cart");
		Reporter.log("Inside Cart");
	}
}
