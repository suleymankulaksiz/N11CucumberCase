package stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.N11page;
import utilities.ConfigReader;
import utilities.Driver;
import org.openqa.selenium.interactions.Actions;

import static javax.swing.UIManager.get;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.driver;
import static utilities.Driver.getDriver;

public class N11step {


    N11page n11page = new N11page();
    Actions actions = new Actions(driver);


    @Given("The user navigates to the homepage.")
    public void user_navigates_to_homepage() {

    }

    @When("It is confirmed that the homepage has loaded.")
    public void homepage_loaded() {
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        String expectedTitle = "n11 - 10 Üzerinden 11'lik Alışveriş Deneyimi";
        assertEquals(expectedTitle, actualTitle);
    }

    @And("The user finds the 'Sign In' button on the homepage and clicks it.")
    public void user_find_sign_btn_click() {
        n11page.btnGirisYap.click();

    }

    @And("It is confirmed that the login page has loaded.")
    public void login_page_loaded() {
        String actualUrl = getDriver().getCurrentUrl();
        System.out.println("actual url= "+actualUrl);
        String expectedUrl = "https://www.n11.com/giris-yap";
        assertEquals(expectedUrl, actualUrl);
    }

    @And("The user enters a valid username in the username field on the login page.")
    public void click_username_input() {
        n11page.btnEmail.sendKeys(ConfigReader.getProperty("email"));
    }

    @And("The user enters a valid password in the password field on the login page.")
    public void click_password_input() {
        n11page.btnPassword.sendKeys(ConfigReader.getProperty("password"));
    }

    @And("The user clicks on the 'Sign In' button.")
    public void click_login_btn() {
        n11page.LoginButton.click();
    }

    @And("It is confirmed that the user has successfully logged into their account.")
    public void succes_login_control() throws InterruptedException {
        actions.moveToElement(n11page.btnHesabim).perform();
        assertTrue(n11page.btnCikisYap.isEnabled());
    }

    @Then("The user clicks on the search box.")
    public void click_searchbox() {
        actions.moveToElement(n11page.btnSearchbox).perform();
        n11page.btnSearchbox.sendKeys(ConfigReader.getProperty("items_name"));
    }

    @And("The user clicks on the search button.")
    public void click_search_button() {
        n11page.btnSearchBtn.click();

    }

    @And("The user clicks on the product.")
    public void click_product_item_listed() throws InterruptedException {
        Thread.sleep(2000); //for cookie
        n11page.productClick.click();
    }

    @And("The product is added to the cart.")
    public void product_added_to_cart() {
        n11page.productAddToCart.click();
    }
    @And("It is confirmed that there is an item in the cart.")
    public void check_basket_box() {
        String expectedText = "Sepetim (1)";
        String actualText = n11page.control_basket.getText();
        assertTrue(actualText.contains(expectedText));
    }
}