package com.ecom.webapp.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonSourceURLTest {

	public static void main(String[] args) {
		
		// 1. formulate a test domain url
		final String siteURL = "https://www.amazon.in/";
		
		// 2. locate web driver
		final String driverPath= "/home/wahidkhan74gmai/Selenium-Workspace/phase5-selenium-test-04-05-2021/driver/geckodriver";
		
		// 3. set selenium properties
		System.setProperty("webdriver.gecko.driver", driverPath);
		
		// 4. Instantiate selenium web driver
		WebDriver driver = new FirefoxDriver();
		
		// 5. launch browser
		driver.get(siteURL);
		
		// 6. perform test evaluation
		
		if(driver.getCurrentUrl().equals(siteURL)) {
			System.out.println("--- Test is Passed ---");
		} else {
			System.out.println("--- Test is Failed ---");
		}
		
		System.out.println("Actual URL : "+driver.getCurrentUrl());
		System.out.println("Expected URL : "+ siteURL);
		
		// 7. close browser window
		driver.close();
	}

}
