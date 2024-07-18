package hu.masterfield.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchResultPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"results\"]/h1")
    private WebElement searchResultTitle;

    @FindBy(xpath = "//div[@id='product-list']//strong[2]")
    private WebElement numberOfResults;


    public SearchResultPage(WebDriver inputDriver) {
        super(inputDriver);
        isLoaded(searchResultTitle);
    }

    //Metódus
    public String getTitleText() {
        //return driverInPageObject.findElement(searchResultTitle).getText();
        return searchResultTitle.getText();
    }

    public String getNumberOfResults() {
        return numberOfResults.getText();
    }

    public void checkProductName(String product) {
        assertEquals("Találatok erre “" + product + "”", searchResultTitle.getText());

    }

    public void checkProductNum(int numOfProducts) {

        assertEquals(numOfProducts + " termékből", numberOfResults.getText());
    }
}
