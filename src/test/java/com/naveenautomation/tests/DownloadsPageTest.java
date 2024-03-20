package com.naveenautomation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.Utility.Utility;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.DownloadsPage;
import com.naveenautomation.pages.MyAccountPage;

public class DownloadsPageTest extends TestBase{
	
	
	AccountLoginPage loginPage;
	MyAccountPage myAccount;
    DownloadsPage downloads;
	
	@BeforeMethod
	public void launchBrowser() {
		pageInitialisation();
		loginPage=new AccountLoginPage();
	}
	
	@Test
	public void validateDownloads() {
		myAccount=loginPage.loggingIn("vrk@yahoo.com", "Password@1");
		downloads=myAccount.clickDownloadsBtn();
		downloads.downloadsFlow();
			
	}
	
	@AfterMethod
	public void closeBrowser() {
		pageQuit();
	}
	

}
