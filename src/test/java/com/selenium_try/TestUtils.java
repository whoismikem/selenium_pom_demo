package com.selenium_try;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.apache.commons.io.FileUtils;
import java.io.*;
import java.time.Duration;
import org.openqa.selenium.*;

public class TestUtils {

	protected static WebDriver driver;
	protected static String BaseURL = "https://www.gab.com";
	
	@BeforeClass
	public static void setUp(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@After
	public void cleanUp(){
		driver.manage().deleteAllCookies();
	}
	
	@AfterClass
	public static void tearDown(){
		driver.close();
	}
	
	public static void takeScreenshot(String fileName) {
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("./screenshots/"+fileName+".png"));
		} catch (Exception e) {
			// TODO: handle exception
		}
        
        
    }
}