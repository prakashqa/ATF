package com.crm.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.crm.config.BrowserDriver;
import com.crm.config.PropertyLoader;
import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.services.AccountsService;
import com.crm.services.HomeService;
import com.crm.services.LoginService;

import com.crm.validators.CreateAccountValidators;

public class CreateAccountTestScripts {//extends BaseListener// 
	
	LoginService loginService = null;
	HomeService homeService = null;
	AccountsService accountService = null;
	CreateAccountValidators accountValidator = null;
	
	CrmLoginData crmLoginData = null;
	List<LoginData> appData = null;


	
	@BeforeClass
	public void init() {
		loginService = new LoginService();
		homeService = new HomeService();
		accountService = new AccountsService();
		accountValidator = new CreateAccountValidators();
		
		crmLoginData = CrmTestData.getTestData();
		appData = crmLoginData.getCrmlogindata();
		InitializeViews.init();
		
		BrowserDriver.getCurrentDriver().get(PropertyLoader.getUrl());
		loginService.loginToApplication(appData.get(0).getUsername(), appData.get(0).getPassword());
		//test = extent.createTest("Functional Test Cases");
	}

	
	@Test(description = "It creates account with billing address", priority=0)
	public void createAccountWithBillingAddress() throws InterruptedException {
		
		homeService.clickOnAccountsTab();
		accountService.clickOnCreateAccount().insertAccountNameAndEmail(appData.get(0).getAccountEmail());
		accountService.insertAccountWebSite(appData.get(0).getWebsite());
		accountService.insertBillingAddress(appData.get(0).getStreet(), appData.get(0).getCity(), appData.get(0).getState(), appData.get(0).getCountry(), appData.get(0).getZip());
		accountService.saveTheAccount();
		
		//homeService.clickOnAccountsTab();
		
		//accountValidator.validateAccountName(accountService);
		
		//accountValidator.validateBillingAddress(accountService);	
	}
	
	@Test(description = "This test case creates account with billing and shipping address", priority=1)
	public void createAccountWithBillingAdressAndShippingAddress() throws InterruptedException {
		
		homeService.clickOnAccountsTab();
		//accountService.clickOnCreateAccount().insertAccountNameAndEmail().insertAccountWebSite().insertMobileNumber();
		accountService.clickOnCreateAccount().insertAccountNameAndEmail(appData.get(0).getAccountEmail());
		accountService.insertAccountWebSite(appData.get(0).getWebsite()).insertMobileNumber();
		//accountService.insertBillingAddress().clickOnCopyBilling().saveTheAccount().getBillingAddressFromWebPage();
		
		BrowserDriver.getCurrentDriver().findElement(By.id("nav-menu-dropdown")).click();
		BrowserDriver.getCurrentDriver().findElement(By.linkText("Log Out")).click();	
		
	}


}
