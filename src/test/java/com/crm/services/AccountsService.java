package com.crm.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.crm.config.BrowserDriver;
import com.crm.pageobjects.AccountsPageContainer;
import com.crm.util.CommonUtil;

public class AccountsService {
	
	public static AccountsPageContainer accountsPageContainer;
	private static Logger log = Logger.getLogger(AccountsService.class);
	
	//this method clicks on crate account button from accounts page
	public AccountsService clickOnCreateAccount() {
		accountsPageContainer.getCreateAccount().click();
		return this;
	}
	
	//this method insert data into account name and email
	public AccountsService insertAccountNameAndEmail(String email) {
		accountsPageContainer.getTxtAccountName().sendKeys(CommonUtil.generateRandomName());
		accountsPageContainer.getTxtAccountEmail().sendKeys(email);
		return this;
	}
	
	//it inserts website details
	public AccountsService insertAccountWebSite(String wsite) {
		accountsPageContainer.getTxtAccountWebSite().sendKeys(wsite);
		return this;
	}
	
	public AccountsService insertBillingAddress(String st, String city, String sta, String coun, String zip) {
		accountsPageContainer.getTxtBillingStreet().sendKeys(st);
		accountsPageContainer.getTxtBillingCity().sendKeys(city);
		accountsPageContainer.getTxtBillingState().sendKeys(sta);
		accountsPageContainer.getTxtBillingCountry().sendKeys(coun);
		accountsPageContainer.getTxtBillingZip().sendKeys(zip);
		return this;
	}
	
	public AccountsService saveTheAccount() throws InterruptedException {
		accountsPageContainer.getSaveAccount().click();
		Thread.sleep(4000);
		log.info("Account created successfully");
		return this;
	}
	
	public String getCreatedAccountName() {
		String aname = accountsPageContainer.getAccountNameAccountsPage().getText();
		System.out.println("Account Name: "+aname);
		return aname;
	}
	
	public AccountsService insertMobileNumber() {
		String num = Integer.toString(CommonUtil.generateRandomNumber());
		System.out.println(num);
		BrowserDriver.selectDropDownItem(accountsPageContainer.getPhoneDropDown(), "Mobile");
		accountsPageContainer.getTxtFieldPhone().sendKeys(num);
		return this;
	}
	
	public AccountsService clickOnCopyBilling() {
		BrowserDriver.waitForPageElement(accountsPageContainer.getButtonCopyBilling(), 45);
		accountsPageContainer.getButtonCopyBilling().click();
		return this;
	}
	
	public String getBillingAddressFromWebPage() {
		String str = accountsPageContainer.getBillingAdd.getText();
		//System.out.println(str);
		return str;
	}
	
	public static void init() {
		accountsPageContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AccountsPageContainer.class);
	}

}
