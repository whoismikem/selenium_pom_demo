package com.selenium_try;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import org.junit.Before;

public class MarketplacePageTest extends TestUtils {

    @Before
    public void beforeEach() {
        driver.get(BaseURL + "/marketplace");
    }

    @Test
    public void searchForItems() {

        MarketplacePage marketplacePage = new MarketplacePage(driver);
        assertTrue(marketplacePage.isInitialized());

        marketplacePage.search.clickSearchField();
        marketplacePage.search.enterSerachFieldText("Bicycle");
        marketplacePage.search.clickSubmitButton();
        assertTrue(marketplacePage.searchResultsLoaded());
        super.takeScreenshot("bicycle_search_results");

    }
}
