package com.naveenautomation.tests;

import org.testng.annotations.BeforeMethod;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;

public class WishlistPageTest extends TestBase{
	
	
	AccountLoginPage loginPage;
	MyAccountPage myAccount;
	//WishlistPage wishlist;
	
	
	@BeforeMethod
	public void launchBrowser() {
		pageInitialisation();
		loginPage=new AccountLoginPage();
	}
	
	
	/*
	 * @Test public void validateNewAddressAddition() {
	 * myAccount=loginPage.loggingIn("vrk@yahoo.com", "Password@1");
	 * wishlist=myAccount.clickWishlistBtn(); wishlist.validateWishlistFlow();
	 * 
	 * }
	 */


}
