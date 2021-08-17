package com.crm.validators;

import java.util.List;

import org.testng.Assert;

import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.services.AccountsService;

public class CreateAccountValidators {
	
	CrmLoginData crmLoginData = CrmTestData.getTestData();
	List<LoginData> appData = crmLoginData.getCrmlogindata();
	
	public void validateAccountName(AccountsService accountsService) {
		String insertedAccountName = appData.get(0).getAccountName();
		
		String accountName = accountsService.getCreatedAccountName();
		
		Assert.assertEquals(accountName, insertedAccountName);
	}
	
	public void validateBillingAddress(AccountsService accountsService) {
		String xmlStreet = appData.get(0).getStreet();
		String xmlState = appData.get(0).getState();
		String xmlCity = appData.get(0).getCity();
		String xmlCountry = appData.get(0).getCountry();
		String xmlZip = appData.get(0).getZip();
		
		String billingAddress = accountsService.getBillingAddressFromWebPage();
		
		String line[] = billingAddress.split("\\r?\\n");
	
		String[] lineIn = line[1].split(" ");
		
		String removeComm = lineIn[0].replace(",", "");
		
		Assert.assertEquals(xmlStreet, line[0]);
		Assert.assertEquals(xmlState, lineIn[1]);
		Assert.assertEquals(xmlCity, removeComm);
		Assert.assertEquals(xmlCountry, line[2]);
		Assert.assertEquals(xmlZip, lineIn[2]);
		
	}

}
