package com.crm.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountsPageContainer {
	
	@FindBy(xpath = "//a[@data-name='create']")
	public WebElement createAccount;
	
	@FindBy(xpath = "//input[@data-name='name']")
	public WebElement txtAccountName;
	
	@FindBy(xpath = "//input[@type='email']")
	public WebElement txtAccountEmail;
	
	@FindBy(xpath = "//input[@data-name='website']")
	public WebElement txtAccountWebSite;
	
	@FindBy(xpath = "//textarea[@data-name='billingAddressStreet']")
	public WebElement txtBillingStreet;
	
	@FindBy(xpath = "//input[@data-name='billingAddressCity']")
	public WebElement txtBillingCity;
	
	@FindBy(xpath = "//input[@data-name='billingAddressState']")
	public WebElement txtBillingState;
	
	@FindBy(xpath = "//input[@data-name='billingAddressPostalCode']")
	public WebElement txtBillingZip;
	
	@FindBy(xpath = "//input[@data-name='billingAddressCountry']")
	public WebElement txtBillingCountry;
	
	@FindBy(xpath = "//button[text()='Save']")
	public WebElement saveAccount;
	
	@FindBy(xpath = "//td[@data-name='name']")
	public WebElement accountNameAccountsPage;
	
	@FindBy(xpath = "//select[@data-property-type='type']")
	public WebElement phoneDropDown;
	
	@FindBy(css = ".form-control.phone-number.no-margin-shifting")
	public WebElement txtFieldPhone;
	
	@FindBy(xpath = "//button[text()='Copy Billing']")
	public WebElement buttonCopyBilling;
	
	@FindBy(xpath = "//div[@class='field' and @data-name='billingAddress']")
	public WebElement getBillingAdd;

	public WebElement getCreateAccount() {
		return createAccount;
	}

	public void setCreateAccount(WebElement createAccount) {
		this.createAccount = createAccount;
	}

	public WebElement getTxtAccountName() {
		return txtAccountName;
	}

	public void setTxtAccountName(WebElement txtAccountName) {
		this.txtAccountName = txtAccountName;
	}

	public WebElement getTxtAccountEmail() {
		return txtAccountEmail;
	}

	public void setTxtAccountEmail(WebElement txtAccountEmail) {
		this.txtAccountEmail = txtAccountEmail;
	}

	public WebElement getTxtAccountWebSite() {
		return txtAccountWebSite;
	}

	public void setTxtAccountWebSite(WebElement txtAccountWebSite) {
		this.txtAccountWebSite = txtAccountWebSite;
	}

	public WebElement getTxtBillingStreet() {
		return txtBillingStreet;
	}

	public void setTxtBillingStreet(WebElement txtBillingStreet) {
		this.txtBillingStreet = txtBillingStreet;
	}

	public WebElement getTxtBillingCity() {
		return txtBillingCity;
	}

	public void setTxtBillingCity(WebElement txtBillingCity) {
		this.txtBillingCity = txtBillingCity;
	}

	public WebElement getTxtBillingState() {
		return txtBillingState;
	}

	public void setTxtBillingState(WebElement txtBillingState) {
		this.txtBillingState = txtBillingState;
	}

	public WebElement getTxtBillingZip() {
		return txtBillingZip;
	}

	public void setTxtBillingZip(WebElement txtBillingZip) {
		this.txtBillingZip = txtBillingZip;
	}

	public WebElement getTxtBillingCountry() {
		return txtBillingCountry;
	}

	public void setTxtBillingCountry(WebElement txtBillingCountry) {
		this.txtBillingCountry = txtBillingCountry;
	}

	public WebElement getSaveAccount() {
		return saveAccount;
	}

	public void setSaveAccount(WebElement saveAccount) {
		this.saveAccount = saveAccount;
	}

	public WebElement getAccountNameAccountsPage() {
		return accountNameAccountsPage;
	}

	public void setAccountNameAccountsPage(WebElement accountNameAccountsPage) {
		this.accountNameAccountsPage = accountNameAccountsPage;
	}

	public WebElement getPhoneDropDown() {
		return phoneDropDown;
	}

	public void setPhoneDropDown(WebElement phoneDropDown) {
		this.phoneDropDown = phoneDropDown;
	}

	public WebElement getTxtFieldPhone() {
		return txtFieldPhone;
	}

	public void setTxtFieldPhone(WebElement txtFieldPhone) {
		this.txtFieldPhone = txtFieldPhone;
	}

	public WebElement getButtonCopyBilling() {
		return buttonCopyBilling;
	}

	public void setButtonCopyBilling(WebElement buttonCopyBilling) {
		this.buttonCopyBilling = buttonCopyBilling;
	}

	public WebElement getGetBillingAdd() {
		return getBillingAdd;
	}

	public void setGetBillingAdd(WebElement getBillingAdd) {
		this.getBillingAdd = getBillingAdd;
	}

}
