package com.selenium_try;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import org.junit.Before;

public class LegalPagesTest extends TestUtils {

    @Before
	public void beforeEach(){
        driver.get(BaseURL + "/");
	}
    
    @Test
	public void termsOfServiceLoads() {
		
        HomePage homePage = new HomePage(driver);
        assertTrue(homePage.isInitialized());

        homePage.footer.clickTermsOfService();
        super.takeScreenshot("termsOfService_top");

        TermsOfServicePage termsOfServicePage = new TermsOfServicePage(driver);
        assertTrue(termsOfServicePage.isInitialized());
        termsOfServicePage.scrollToBottom();

        super.takeScreenshot("termsOfService_bottom");
      
	}

    @Test
	public void privacyPolicyLoads() {
		
        HomePage homePage = new HomePage(driver);
        assertTrue(homePage.isInitialized());

        homePage.footer.clickPrivacyPolicy();
        super.takeScreenshot("privacyPolicy_top");

        PrivacyPolicyPage privacyPolicyPage = new PrivacyPolicyPage(driver);
        assertTrue(privacyPolicyPage.isInitialized());
        privacyPolicyPage.scrollToBottom();

        super.takeScreenshot("privacyPolicy_bottom");
      
	}

    @Test
	public void copyrightPolicyLoads() {
		
        HomePage homePage = new HomePage(driver);
        assertTrue(homePage.isInitialized());

        homePage.footer.clickCopyrightPolicy();
        super.takeScreenshot("copyrightPolicy_top");

        CopyrightPolicyPage copyrightPolicyPage = new CopyrightPolicyPage(driver);
        assertTrue(copyrightPolicyPage.isInitialized());
        copyrightPolicyPage.scrollToBottom();

        super.takeScreenshot("copyrightPolicy_bottom");
      
	}

    @Test
	public void contactUsLoads() {
		
        HomePage homePage = new HomePage(driver);
        assertTrue(homePage.isInitialized());

        homePage.footer.clickContactUs();

        HelpPage helpPage = new HelpPage(driver);
        assertTrue(helpPage.isInitialized());

        super.takeScreenshot("help_page_start");
      
	}
}
