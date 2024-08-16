package stepDefinition;

import browserControl.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageObject.HoverPage;
import pageObject.JQueryUIPage;

public class JQueryUiStepDeff extends WebConnector {

   JQueryUIPage uiPage=new JQueryUIPage();


    @Then("the user click on enabled button")
    public void theUserClickOnEnabledButton() {
        uiPage.setEnabledButtonXpath();
    }


    @And("the user can see {string} option on the page")
    public void theUserCanSeeOptionOnThePage(String expectedtext) {
        Assert.assertTrue(driver.getPageSource().contains(expectedtext));
    }

    @Then("user click on JQuery UI option")
    public void userClickOnJQueryUIOption() {
        uiPage.JQueryUIButton();
    }


}
