import hu.masterfield.pages.HomePage;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TescoSteps {
     HomePage homePage;

    protected static WebDriver driver;

    protected static WebDriverWait wait;

    /* Selenium Webdriver elindítása */
    @BeforeAll
    public static void setup() {
        // set chrome options
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-blink-features=AutomationControlled");

        // init driver
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().setSize(new Dimension(900, 900));
    }

    @AfterAll
    public static void cleanup() {
        driver.quit();
    }

    @Given("I am on any page of the shopping site")
    public void iAmOnAnyPageOfTheShoppingSite() {
        driver.get("https://bevasarlas.tesco.hu/groceries/");
        wait.until(driver -> driver.findElement(By.className("brand-header__logo")));
    }

    @When("I search for {string}")
    public void iSearchFor(String searchWord) {
        homePage = new HomePage();
        homePage.fillSearchField(searchWord);

    }

    @Then("I should see that the products belonging to {string} appear")
    public void iShouldSeeThatTheProductsBelongingToAppear(String arg0) {
    }

    @And("{int} products are displayed with prices")
    public void productsAreDisplayedWithPrices(int arg0) {
    }
}
