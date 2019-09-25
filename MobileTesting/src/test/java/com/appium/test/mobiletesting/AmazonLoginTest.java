package com.appium.test.mobiletesting;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.appium.test.utils.BaseTest;
import com.appium.test.utils.TestListener;
/**
 * 
 * @author Jijo
 *
 */
@Listeners(TestListener.class)
public class AmazonLoginTest extends BaseTest{
	@Test
	public void checkForLogin() throws Exception 
	{
		LoginPage loginPage = new LoginPage();
		loginPage.loginToAmazonApp();
		
		HomePage homePage = new HomePage();
		homePage.ClickOnMenuOption();
		
		SettingsPage settingPage = new SettingsPage();
		settingPage.changeLocation();
		
		homePage.SearchItem("65-inch TV");
		
		PurchaseItem purchasePage = new PurchaseItem();
		purchasePage.AddToCart();
		
		System.out.println("Reacched");
	}
}
