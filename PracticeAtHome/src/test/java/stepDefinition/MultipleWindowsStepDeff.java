package stepDefinition;

import browserControl.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObject.MultipleWindowsPage;

public class MultipleWindowsStepDeff extends WebConnector {

    MultipleWindowsPage windowsPage=new MultipleWindowsPage();



    @Then("the user click on click here on the page")
    public void theUserClickOnClickHereOnThePage() {
        windowsPage.setClickHereXpath();
    }

    @And("the user press crtl+a to select all")
    public void theUserPressCrtlAToSelectAll() {
        windowsPage.selectAll();
    }
}
