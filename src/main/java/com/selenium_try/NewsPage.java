package com.selenium_try;

import org.openqa.selenium.WebDriver;

public class NewsPage extends PageObjectUtils {

	public NewsPage(WebDriver driver) {
		super(driver);
	}

	public boolean isInitialized() {
        return driver.getTitle().equals("News - Gab Social");
	}
}
