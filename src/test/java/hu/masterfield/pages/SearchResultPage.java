package hu.masterfield.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        assertEquals("Results for “alma”", searchResultTitle.getText());

    }

    public void checkProductNum(int numOfProducts) {
        int actualNumOfProducts = Integer.parseInt(numberOfResults.getText());
        assertTrue(actualNumOfProducts == numOfProducts, "The number of products does not match the expected value.");
    }
}
