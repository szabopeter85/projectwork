package hu.masterfield.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driverInPageObject;
    protected WebDriverWait wait;

    public BasePage(WebDriver inputDriver) {
        this.driverInPageObject = inputDriver;
        this.wait = new WebDriverWait(inputDriver, Duration.ofSeconds(1));
    }

    public BasePage() {

    }

    protected boolean isLoaded(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
    }
}
