package com.selenium_try;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainNav extends PageObjectUtils {
    @FindBy(linkText="Search")
    private WebElement searchButton;

    @FindBy(linkText="Marketplace")
    private WebElement marketplaceButton;

    @FindBy(linkText="News")
    private WebElement newsButton;

    @FindBy(linkText="Shop")
    private WebElement shopButton;

    public MainNav(WebDriver driver) {
        super(driver);
    }

    public void clickSearch() {
        this.searchButton.click();
    }

    public void clickMarketplace() {
        this.marketplaceButton.click();
    }

    public void clickNews() {
        this.newsButton.click();
    }

    public void clickShop() {
        this.shopButton.click();
    }
}
