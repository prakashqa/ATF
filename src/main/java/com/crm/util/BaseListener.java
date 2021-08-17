package com.crm.util;

import org.testng.IClass;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.crm.config.BrowserDriver;

public class BaseListener extends TestListenerAdapter {

	
	@Override
	public void onTestStart(ITestResult itr) {
		log("Test Started..........");
	}
	
	@Override
	public void onTestSuccess(ITestResult itr) {
		log("Test " +itr.getName() + " Passed");
		log(itr.getTestClass());
		log("Priority of the method is " +itr.getMethod().getPriority());

	}
	
	@Override
	public void onTestFailure(ITestResult itr) {
		BrowserDriver.takeScreenShot();
		log("Test " +itr.getName() + " Failed");
		log(itr.getTestClass());
		log("Priority of the method is " +itr.getMethod().getPriority());

	}
	
	private void log(String methodName) {
		System.out.println(methodName);
	}
	
	private void log(IClass testClass) {
		System.out.println(testClass);
	}


}
