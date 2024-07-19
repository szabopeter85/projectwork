package hu.masterfield.pages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver inputDriver) {
        super(inputDriver);
        inputDriver.get("https://www.tesco.hu/account/login/hu-HU/?from=https%3A%2F%2Fbevasarlas.tesco.hu%2Fgroceries%2Fhu-HU%2F%3FjustLoggedIn%3Dtrue");

    }
}