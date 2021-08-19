package com.crm.config;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	private static WebDriver driver;
	
	public static WebDriver getBrowser(String browserType) {
		
		switch(browserType) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "BrowserDrivers//chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.setAcceptInsecureCerts(true);
				driver = new ChromeDriver();
				break;
				
			case "firefox":
				System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
				break;
				
			case "edge":
				System.setProperty("webdriver.edge.driver", "ATF//BrowserDrivers//msedgedriver.exe");
				driver = new EdgeDriver();
				break;
				
			case "ie":
				System.setProperty("webdriver.ie.driver", "D:\\Softwares\\drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				break;
		}
		
		/*if(browserType == "chrome") {
			System.setProperty("webdriver.chrome.driver", "D:\\Projects\\root02\\Projects\\ATF\\BrowserDrivers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.setAcceptInsecureCerts(true);
			driver = new ChromeDriver();
		}*/
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
	}

}
