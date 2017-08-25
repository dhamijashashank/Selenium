package com.krishna;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.*;
import org.testng.Assert;

// Below code work only with Safari 
// for rest of browsers , drivers is needed 

public class TestClass {

	private WebDriver driver;
	
	@Before
	public void setUp() {
		System.out.println("*******************");
		System.out.println("launching firefox browser");
		
		//System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver");
		driver = new SafariDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void testGooglePageTitleInChrome() {
		System.out.println("In test method : start");
		driver.navigate().to("http://www.google.com");
		String strPageTitle = driver.getTitle();
		Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");
		System.out.println("In test method : end");
	}

	@After
	public void tearDown() {
		if(driver!=null) {
			System.out.println("Closing chrome browser");
			driver.quit();
		}
	}
	
}
