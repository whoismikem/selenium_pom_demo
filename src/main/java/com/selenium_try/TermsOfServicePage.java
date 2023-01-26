package com.selenium_try;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TermsOfServicePage extends PageObjectUtils {
    @FindBy(css=".\\_3jtEZ > .\\_UuSG")
    private WebElement leftPageHeading;

    @FindBy(css=".\\_3_54N:nth-child(3)")
    private WebElement centerPageHeading;

    @FindBy(css=".\\_UuSG:nth-child(126)")
    private WebElement commentsAndConcerns;
    
    public TermsOfServicePage(WebDriver driver) {
        super(driver);
    }

    public boolean isInitialized() {
        return this.leftPageHeading.getText().equals("Terms of Service");
    }
}
