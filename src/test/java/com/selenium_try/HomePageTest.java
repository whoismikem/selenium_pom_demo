package com.selenium_try;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;

public class HomePageTest extends TestUtils {

    @Before
    public void beforeEach(){
        driver.get(BaseURL + "/");
    }
    
    @Test
    public void navigateToHomePage() {
        
        HomePage homePage = new HomePage(driver);
        assertTrue(homePage.isInitialized());
    }

    @Test
    public void navigateToMarketplacePage() {
        
        HomePage homePage = new HomePage(driver);
        assertTrue(homePage.isInitialized());

        // Use main nav to navigate to marketplace
        homePage.mainNav.clickMarketplace();
        MarketplacePage marketplacePage = new MarketplacePage(driver);
        assertTrue("Verify marketplace page loaded", 
                    marketplacePage.isInitialized());
    }

    @Test
    public void navigateToNewsPage() {
        
        HomePage homePage = new HomePage(driver);
        assertTrue(homePage.isInitialized());

        // Use main nav to navigate to News
        homePage.mainNav.clickNews();
        NewsPage newsPage = new NewsPage(driver);
        assertTrue("Verify news page loaded", 
                    newsPage.isInitialized());
    }

    @Test
    public void navigateToShopPage() {
        
        HomePage homePage = new HomePage(driver);
        assertTrue(homePage.isInitialized());

        // Use main nav to navigate to Shop
        homePage.mainNav.clickShop();
        ShopPage shopPage = new ShopPage(driver);
        assertTrue("Verify shop page loaded", 
                    shopPage.isInitialized());
    }

    @Test
    public void legalLinksPresent() {
        
        HomePage homePage = new HomePage(driver);
        assertTrue(homePage.isInitialized());

        assertEquals("Check if Legal section is present in footer", 
                    homePage.footer.legalTitleText(), 
                    "Legal");
        
        assertEquals("Check if Terms of Service link is present in footer", 
                    homePage.footer.termsOfServiceLinkText(), 
                    "Terms of Service");
    }

    @Test
    public void navigateToTermsOfService() {

        HomePage homePage = new HomePage(driver);
        assertTrue(homePage.isInitialized());

        homePage.footer.clickTermsOfService();

        TermsOfServicePage termsOfServicePage = new TermsOfServicePage(driver);
        assertTrue(termsOfServicePage.isInitialized());
        
    }		
}
