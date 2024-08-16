package stepDefinition;

import browserControl.WebConnector;
import io.cucumber.java.en.Then;
import pageObject.InfiniteScrollPage;

public class InfiniteScrollStepDeff extends WebConnector {

    InfiniteScrollPage scrollPage=new InfiniteScrollPage();

    @Then("the user scroll down on the page")
    public void theUserScrollDownOnThePage() {
        scrollPage.scrollDown();

    }


}
