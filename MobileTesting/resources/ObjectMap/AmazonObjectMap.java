package ObjectMap;
/**
 * 
 * @author Jijo
 *
 */

public enum AmazonObjectMap {
		//Login
		Amazon_EXISTINGSIGNIN_XPATH ("//*[@resource-id='com.amazon.mShop.android.shopping:id/sign_in_button']"),
		Amazon_LOGINTEXTBOX_XPATH ("//android.widget.EditText[@content-desc='Email (phone for mobile accounts)']"),
		Amazon_PASSWORDTEXTBOX_XPATH ("//android.view.View[@content-desc='Amazon password']/following-sibling::android.view.View/android.widget.EditText"),
		Amazon_SIGNIN_XPATH ("//android.widget.Button[@content-desc=' Sign-In ']"),
		Amazon_SIGNIN_ACC ("\n                  Sign-In\n                "),
		//HomePage
		Amazon_HEADER_XPATH ("//*[@resource-id='com.amazon.mShop.android.shopping:id/action_bar_home_logo']"),
		Amazon_MENU_XPATH ("//*[@resource-id='com.amazon.mShop.android.shopping:id/action_bar_burger_icon']"),
		Amazon_SEARCHTEXTBOX_XPATH ("//*[@resource-id='com.amazon.mShop.android.shopping:id/rs_search_src_text']"),
		Amazon_SEARCHOPTION_XPATH ("//*[@resource-id='com.amazon.mShop.android.shopping:id/iss_search_dropdown_item_department']"),
		//SettingsPage
		Amazon_SETTINGTAB_ACC ("Settings button. Double tap for links to change country, sign out, and more."),
		Amazon_COUNTRY_XPATH ("//*[@resource-id='com.amazon.mShop.android.shopping:id/drawer_item_title'][@text='Country & Language']"),
		Amazon_COUNTRYUS_XPATH ("//android.widget.Button[@content-desc='Country/Region: United States']"),
		Amazon_COUNTRYAUS_ACC ("Australia Amazon.com.au "),
		Amazon_COUNTRYDONEBUTTON_XPATH ("//android.widget.Button[@content-desc='Done']"),
		//PurchaseItem
		Amazon_RESULTS_ACC ("Results"),
		Amazon_PRODUCTDESC_XPATH ("(//*[@resource-id='com.amazon.mShop.android.shopping:id/mash_web_fragment']//android.webkit.WebView)[1]"),
		Amazon_ALLBUYINGOPTION_ACC ("\nSee All Buying Options\n"),
		Amazon_ADDTOCART_XPATH ("(//*[contains(@content-desc,'Add to Cart')])[1]"),
		Amazon_CART_ACC ("Cart"),
		//DUMMY WEB ELEMENT DO NOT DELETE
		Amazon_XPATH_ID ("ENDS"); 

		
	//the methods below MUST be in the enum or this will not work
	private final String enumValue;       

		private AmazonObjectMap(String s) {
		 	enumValue = s;
		}
			   
		public String getValue () {
			return enumValue;
		}
		
		public String toString() {
			return getValue();	
		}

}
