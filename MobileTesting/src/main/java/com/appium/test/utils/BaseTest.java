package com.appium.test.utils;
/**
 * 
 * @author Jijo
 * 
 */
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseTest {
	protected static AndroidDriver<MobileElement> driver;
	
	@BeforeSuite
	@Parameters({"udidNumber","serverURL"})
	public void setUp(String udidNumber, String serverURL) throws InterruptedException, MalformedURLException {
	   //Capabilities
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("udid", udidNumber);
//		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("deviceName","Android Emulator");
		capabilities.setCapability("deviceName","oneplus6");
		capabilities.setCapability("app", System.getProperty("user.dir")+"\\resources\\app\\Amazon_shopping.apk");
		capabilities.setCapability("appPackage", "com.amazon.mShop.android.shopping");
		capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
		capabilities.setCapability("clearSystemFiles", true);
		capabilities.setCapability("appWaitActivity", "*");
//		capabilities.setCapability("fullReset","true");
		capabilities.setCapability("noReset","false");
	  //Initialize Android driver
	   driver = new AndroidDriver<MobileElement> (new URL(serverURL), capabilities);
	  // Implicit Wait
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   System.out.println("The app has been launched");
	   driver.resetApp();
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
	
}