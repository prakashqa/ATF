package com.crm.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageContainer {
	
	@FindBy(xpath = "//span[text()='Accounts']")
	public WebElement homePageAccountsTab;
	
	@FindBy(xpath = "//span[text()='Contacts']")
	public WebElement homePageContactsTab;

	public WebElement getHomePageAccountsTab() {
		return homePageAccountsTab;
	}

	public void setHomePageAccountsTab(WebElement homePageAccountsTab) {
		this.homePageAccountsTab = homePageAccountsTab;
	}

	public WebElement getHomePageContactsTab() {
		return homePageContactsTab;
	}

	public void setHomePageContactsTab(WebElement homePageContactsTab) {
		this.homePageContactsTab = homePageContactsTab;
	}

}
