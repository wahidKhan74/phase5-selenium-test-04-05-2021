package com.ecom.webapp.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {
		
		// 1. formulate a test domain url
		final String siteURL = "http://www.google.com/";

		// 2. locate web driver
		final String driverPath = "/home/wahidkhan74gmai/Selenium-Workspace/phase5-selenium-test-04-05-2021/driver/geckodriver";

		// 3. set selenium properties
		System.setProperty("webdriver.gecko.driver", driverPath);

		// 4. Instantiate selenium web driver
		WebDriver driver = new FirefoxDriver();

		// 5. launch browser
		driver.get(siteURL);

		// 6. test evaluation
		// find dom element (search box)
		WebElement searchBox = driver.findElement(By.name("q"));
		
		searchBox.sendKeys("selenium documentation");
		searchBox.submit();
		
		String expectedTitle = "Google";
		
		if(driver.getTitle().equals(expectedTitle)) {
			System.out.println("--- Test is Passed ---");
			
		} else {
			System.out.println("--- Test is Failed ---");
		}
		System.out.println("Actual Title : "+driver.getTitle());
		System.out.println("Expected Title : "+ expectedTitle);
		
		driver.close();
	}

}
