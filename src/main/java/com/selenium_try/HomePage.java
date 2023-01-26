package com.selenium_try;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObjectUtils {
    private String pageTitle = "Gab.com - Gab Social";
    public MainNav mainNav;
	public Footer footer;

	@FindBy(css=".\\_81_1w:nth-child(1) .\\_UuSG > .\\_UuSG > .\\_UuSG > div > .\\_UuSG:nth-child(4) > .\\_UuSG:nth-child(1)")
	private WebElement postToolbar;
    
	public HomePage(WebDriver driver) {
		super(driver);
        this.mainNav = new MainNav(driver);
		this.footer = new Footer(driver);
	}

	public boolean isInitialized() {
        return driver.getTitle().equals(this.pageTitle);
	}
	
	public void isFooterPresent() {
		footer.legalTitleText();
	}
}
