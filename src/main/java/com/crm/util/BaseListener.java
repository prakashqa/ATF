package com.crm.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.IClass;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.crm.config.BrowserDriver;

public class BaseListener extends TestListenerAdapter {
	
	public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest test;
     
    @BeforeSuite
    public void setUp()
    {
        htmlReporter = new ExtentHtmlReporter("Reports//crm-test-result.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
         
        extent.setSystemInfo("OS", "Windows");
        extent.setSystemInfo("Host Name", "Prakash");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("User Name", "Prakash Testing");

        htmlReporter.config().setDocumentTitle("Crm Automation Testing Report");
        htmlReporter.config().setReportName("My Own Report");
        htmlReporter.config().setTheme(Theme.DARK);
    }
   
     
    @AfterMethod
    public void getResult(ITestResult result) throws IOException
    {
        if(result.getStatus() == ITestResult.FAILURE)
        {
        	BrowserDriver.takeScreenShot();
        	htmlReporter.config().setAutoCreateRelativePathMedia(true);
            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test case FAILED due to below issues:", ExtentColor.RED));
           // test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("1.png").build());
           // test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("2.png").build());
            test.fail(result.getThrowable());
        }
        else if(result.getStatus() == ITestResult.SUCCESS)
        {
            test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
        }
        else
        {
            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case SKIPPED", ExtentColor.ORANGE));
            test.skip(result.getThrowable());
        }
    }
     
    @AfterSuite
    public void tearDown()
    {
        extent.flush();
    }
}
	
	/*@Override
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
	}*/



