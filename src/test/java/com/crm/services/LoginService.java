package com.crm.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.crm.config.BrowserDriver;
import com.crm.pageobjects.LoginPageContainer;

public class LoginService {
	
	public static LoginPageContainer loginPageContainer;
	private static Logger log = Logger.getLogger(LoginService.class);
	
	//reusable application login method
	public void loginToApplication(String uname, String pword) {
		loginPageContainer.getTxtFieldUserName().sendKeys(uname);
		loginPageContainer.getTxtFieldPassword().sendKeys(pword);
		loginPageContainer.getLoginButton().click();
		log.info("User logged into Crm Application");
	}
	
	public static void init() {
		loginPageContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), LoginPageContainer.class);
	}

}
