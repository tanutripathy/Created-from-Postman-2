package stepDefinition;

import browserControl.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageObject.AddAndDeletePage;

public class AddDeleteStepDeff extends WebConnector {

    AddAndDeletePage deletePage=new AddAndDeletePage();

    @Then("the user click on add element")
    public void theUserClickOnAddElement() {
        deletePage.setAddXpath();
    }

    @And("the user see {string} option on the page")
    public void theUserSeeOptionOnThePage(String expectedtext) {
        Assert.assertTrue(driver.getPageSource().contains(expectedtext));
    }

    @Then("the user click on delete element")
    public void theUserClickOnDeleteElement() {
        deletePage.setDeleteXpath();
    }


}
