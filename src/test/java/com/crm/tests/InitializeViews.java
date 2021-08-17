package com.crm.tests;

import org.openqa.selenium.WebDriver;

import com.crm.config.BrowserDriver;
import com.crm.services.AccountsService;
import com.crm.services.HomeService;
import com.crm.services.LoginService;

public class InitializeViews {
	
	protected static WebDriver driver = null;
	
	public static void init() {
		driver = BrowserDriver.getCurrentDriver();
		LoginService.init();
		HomeService.init();
		AccountsService.init();
	}

}
