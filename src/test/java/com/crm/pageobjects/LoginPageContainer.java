package com.crm.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageContainer {
	
	@FindBy(xpath = "//input[@id='field-userName']")
	public WebElement txtFieldUserName;
	
	@FindBy(xpath = "//input[@id='field-password']")
	public WebElement txtFieldPassword;
	
	@FindBy(xpath = "//button[@id='btn-login']")
	public WebElement loginButton;

	public WebElement getTxtFieldUserName() {
		return txtFieldUserName;
	}

	public void setTxtFieldUserName(WebElement txtFieldUserName) {
		this.txtFieldUserName = txtFieldUserName;
	}

	public WebElement getTxtFieldPassword() {
		return txtFieldPassword;
	}

	public void setTxtFieldPassword(WebElement txtFieldPassword) {
		this.txtFieldPassword = txtFieldPassword;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}

}
