package com.selenium_try;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class MarketplacePage extends PageObjectUtils {
    public Search search;
    
    @FindBy(css=".\\_3jtEZ > .\\_UuSG")
    private WebElement leftPageHeading;

    @FindBy(css=".\\_3_54N:nth-child(3)")
    private WebElement centerPageHeading;

    @FindBy(xpath="//*[@id=\"gabsocial\"]/div/div[2]/div[2]/div/main/div/div[1]/div/div/div/div[2]/div/a[*]")
    private List<WebElement> searchResultsItems;
    
    public MarketplacePage(WebDriver driver) {
        super(driver);
        this.search = new Search(driver);
    }

    public boolean isInitialized() {
        return driver.getTitle().equals("Marketplace - Gab Social");
    }

    public boolean searchResultsLoaded() {
        return !this.searchResultsItems.isEmpty();
    }
}
