package com.selenium_try;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Footer extends PageObjectUtils {
    @FindBy(css = ".\\_UuSG:nth-child(4) > .\\_2E1ls > .\\_UuSG")
    private WebElement legalTitle;

    @FindBy(css = ".\\_UuSG:nth-child(4) > .\\_UuSG:nth-child(2) > .grnpY")
    private WebElement termsOfServiceLink;

    @FindBy(css = ".\\_UuSG:nth-child(4) > .\\_UuSG:nth-child(3) > .grnpY")
    private WebElement privacyPolicyLink;

    @FindBy(css = ".\\_UuSG:nth-child(4) > .grnpY")
    private WebElement copyrightPolicyLink;

    @FindBy(css = ".\\_UuSG:nth-child(5) > .grnpY")
    private WebElement contactUsLink;

    @FindBy(css = ".\\_2mtbj:nth-child(2) > .\\_2ZzNB")
    private WebElement madeInAmerica;

    public Footer(WebDriver driver) {
        super(driver);
    }

    public WebElement legalTitleElement() {
        return this.legalTitle;
    }

    public WebElement termsOfServiceLinkElement() {
        return this.termsOfServiceLink;
    }

    public String termsOfServiceLinkText() {
        return this.termsOfServiceLink.getText();
    }

    public WebElement madeInAmericaElement() {
        return this.madeInAmerica;
    }

    public String legalTitleText() {
        return this.legalTitle.getText();
    }

    public void clickTermsOfService() {
        this.termsOfServiceLink.click();
    }

    public void clickPrivacyPolicy() {
        this.privacyPolicyLink.click();
    }

    public void clickCopyrightPolicy() {
        this.copyrightPolicyLink.click();
    }

    public void clickContactUs() {
        this.contactUsLink.click();
    }
}
