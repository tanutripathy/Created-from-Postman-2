package stepDefinition;

import browserControl.WebConnector;
import io.cucumber.java.en.Then;
import pageObject.InputPage;

public class InputStepDeff extends WebConnector {

    InputPage page=new InputPage();

    @Then("the user enter {string}in text box")
    public void theUserEnterInTextBox(String num) {
        page.setInputXpath(num);

    }
}
