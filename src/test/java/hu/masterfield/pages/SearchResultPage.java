package hu.masterfield.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends BasePage {

    @FindBy(xpath = "//h2[text()='Tanfolyam találatok']")
    private WebElement searchResultTitle;

    @FindBy(className = "badge-info")
    private WebElement numberOfResults;

    //UI elemek
    //By searchResultTitle = By.xpath("//h2[text()='Tanfolyam találatok']");

    public SearchResultPage(WebDriver inputDriver) {
        super(inputDriver);
        PageFactory.initElements(inputDriver, this);
    }

    //Metódus
    public String getTitleText() {
        //return driverInPageObject.findElement(searchResultTitle).getText();
        return searchResultTitle.getText();
    }

    public String getNumberOfResults() {
        return numberOfResults.getText();
    }

}
