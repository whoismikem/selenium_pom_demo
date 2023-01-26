package com.selenium_try;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HelpPage extends PageObjectUtils {
    @FindBy(css = ".col-lg-8 > .text-center:nth-child(1)")
    private WebElement centerPageHeading;

    public HelpPage(WebDriver driver) {
        super(driver);
    }

    public boolean isInitialized() {
        return this.centerPageHeading.getText().equals("Gab.com Help");
    }
}
