package hu.masterfield.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
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

    @FindBy(id = "mod-search-searchword")
    private WebElement searchField;

    @FindBy(css = "#mod-search-searchword + button")
    private WebElement searchButton;

    @FindBy(css = "@brand-header__logo")
    private WebElement logo;

    public HomePage(WebDriver inputDriver) {
        super(inputDriver);
        inputDriver.get("https://bevasarlas.tesco.hu/groceries/");
        isLoaded(logo);
        wait.until(driver -> driver.findElement(By.className("brand-header__logo")));
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
