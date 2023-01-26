package com.selenium_try;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrivacyPolicyPage extends PageObjectUtils {
    @FindBy(css=".\\_3jtEZ > .\\_UuSG")
    private WebElement leftPageHeading;

    @FindBy(css=".\\_3_54N:nth-child(3)")
    private WebElement centerPageHeading;
    
    public PrivacyPolicyPage(WebDriver driver) {
        super(driver);
    }

    public boolean isInitialized() {
        return this.leftPageHeading.getText().equals("Privacy Policy");
    }
}
