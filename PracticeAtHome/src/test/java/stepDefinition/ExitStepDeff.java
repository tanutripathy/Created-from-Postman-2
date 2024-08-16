package stepDefinition;

import browserControl.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObject.ExitPage;

public class ExitStepDeff extends WebConnector {

    ExitPage exitPage=new ExitPage();


    @And("the user move the cursor out of view pane")
    public void theUserMoveTheCursorOutOfViewPane() {
        exitPage.setMoveCursor();
    }



    @Then("the user click on close button")
    public void theUserClickOnCloseButton() {
        exitPage.setCloseButtonXpath();
    }


}
