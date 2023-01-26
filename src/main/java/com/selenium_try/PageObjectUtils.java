package com.selenium_try;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.JavascriptExecutor;


public class PageObjectUtils {
    protected WebDriver driver;
    
    public PageObjectUtils(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void scrollToBottom() {
        // Javascript executor
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}
