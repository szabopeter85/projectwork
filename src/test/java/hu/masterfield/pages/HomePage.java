package hu.masterfield.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    // UI elemek
    @FindBy(xpath = "//a[@role='button' and text()='Megértettem']")
    private WebElement cookieButton;
    //By cookieButton = By.xpath("//a[@role='button' and text()='Megértettem']");

    @FindBy(className = "close")
    private WebElement closeBannerButton;

    @FindBy(id = "mod-search-searchword")
    private WebElement searchField;

    @FindBy(css = "#mod-search-searchword + button")
    private WebElement searchButton;

    public HomePage(WebDriver inputDriver) {
        super(inputDriver);
        PageFactory.initElements(inputDriver, this);
    }

    public HomePage() {
        super();
    }

    // Metódusok
    public void clickOnCookieButton() {
        wait.until(ExpectedConditions.visibilityOf(cookieButton)).isDisplayed();
        //WebElement element = driverInPageObject.findElement(cookieButton);
        //element.click();
        cookieButton.click();
    }

    public void closeBanner() {
        closeBannerButton.click();
    }

    public void fillSearchField(String searchWord) {
        searchField.sendKeys(searchWord);
    }

    public SearchResultPage clickOnSearchButton() {
        searchButton.click();
        return new SearchResultPage(this.driverInPageObject);
    }

    public void load(String url) {
        driverInPageObject.get(url);
        Assertions.assertTrue(isLoaded());
    }

    public boolean isLoaded() {
        return isLoaded(cookieButton);
    }
}
