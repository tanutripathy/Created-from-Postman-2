package stepDefinition;

import browserControl.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObject.KeyPressPage;

public class KeyPressStepDeff extends WebConnector {

    KeyPressPage pressPage=new KeyPressPage();

    @And("the user click on control key")
    public void theUserClickOnControlKey() {
        pressPage.presscontrolkey();
    }

    @Then("the user click on backsapce key")
    public void theUserClickOnBacksapceKey() {
        pressPage.pressescapekey();
    }

    @And("the user click on escape key")
    public void theUserClickOnEscapeKey() {
        pressPage.escapeKey();
    }



}
