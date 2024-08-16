package stepDefinition;

import browserControl.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.EnterAdPage;
import utilities.ConstantUtils;

import java.time.Duration;

public class BasicAuthStepDefif extends WebConnector {

    EnterAdPage page = new EnterAdPage();


    @Given("the user navigate to home page")
    public void the_user_navigate_to_home_page() {
        driver.get(ConstantUtils.BASE_URL);
    }

    @And("the user follow {string} link")
    public void theUserFollowLink(String link) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.linkText(link))).click();
    }


    @Then("the user enter {string} in username field and enter {string} at password field")
    public void theUserEnterInUsernameFieldAndEnterAtPasswordField(String username, String password) {
        driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
    }
    @And("the user can see {string} in the basic auth page")
    public void theUserCanSeeInTheBasicAuthPage(String expectedtext) {
        Assert.assertTrue(driver.getPageSource().contains(expectedtext));
    }


    @Then("the user enter {string} in username field and enter {string} at password fields")
    public void theUserEnterInUsernameFieldAndEnterAtPasswordFields(String username, String password) {
        driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/digest_auth");
    }

    @And("the user see {string} in the digest auth page")
    public void theUserSeeInTheDigestAuthPage(String expectedtext) {
        Assert.assertTrue(driver.getPageSource().contains(expectedtext));
    }


    @Then("the user enter {string} in username field and enter {string} at password field's")
    public void theUserEnterInUsernameFieldAndEnterAtPasswordFieldS(String username, String password) {
        driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/download_secure");
    }
}
