package com.selenium_try;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search extends PageObjectUtils {
    @FindBy(id="mpl-search")
	private WebElement searchField;

    @FindBy(css=".\\_2FoTG > .\\_1MTCR")
    private WebElement submitButton;

    public Search(WebDriver driver) {
		super(driver);
	}

    public void clickSearchField() {
        this.searchField.click();
	}

    public void enterSerachFieldText(String input_text) {
        this.searchField.sendKeys(input_text);
    }

    public void clickSubmitButton() {
        this.submitButton.click();
    }
}
