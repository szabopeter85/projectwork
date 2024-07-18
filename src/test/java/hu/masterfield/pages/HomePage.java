package hu.masterfield.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    // UI elemek
    @FindBy(xpath = "//a[@role='button' and text()='Minden Cookie elfogadása']")
    private WebElement cookieButton;
    //By cookieButton = By.xpath("//a[@role='button' and text()='Minden Cookie elfogadása']");

    @FindBy(className = "close")
    private WebElement closeBannerButton;

    @FindBy(xpath = "//*[@id=\"search-input\"]")
    private WebElement searchField;

    @FindBy(xpath = "//*[@id=\"search-form\"]/button")
    private WebElement searchButton;

    @FindBy(className = "brand-header__logo")
    private WebElement logo;

    public HomePage(WebDriver inputDriver) {
        super(inputDriver);
        inputDriver.get("https://bevasarlas.tesco.hu/groceries/hu-HU/");
        isLoaded(logo);

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

    public SearchResultPage search(String searchWord) {
        searchField.sendKeys(searchWord);
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
