package com.crm.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.crm.config.BrowserDriver;
import com.crm.pageobjects.HomePageContainer;

public class HomeService {
	
	public static HomePageContainer homePageContainer;
	private static Logger log = Logger.getLogger(HomeService.class);
	
	public void clickOnAccountsTab() {
		homePageContainer.getHomePageAccountsTab().click();
		log.info("Accounts page opened");
	}
	
	public void clickOnContactsTab() {
		homePageContainer.getHomePageContactsTab().click();
		log.info("Create account page is opened successfully");
	}

	public static void init() {
		homePageContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), HomePageContainer.class);
	}
}
