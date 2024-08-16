package stepDefinition;

import browserControl.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObject.FramesPage;

public class FramesStepDeff extends WebConnector {

    FramesPage framesPage=new FramesPage();

    @Then("the user click on iframe")
    public void theUserClickOnIframe() {
        framesPage.setIframesXpathclick();
    }

    @Then("the user enter {string}in the box")
    public void theUserEnterInTheBox(String text) {
        framesPage.setframeXpath(text);
    }



}
