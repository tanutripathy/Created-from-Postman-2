package stepDefinition;

import browserControl.WebConnector;
import io.cucumber.java.en.Then;
import pageObject.HoverPage;
import pageObject.InfiniteScrollPage;

public class HoverStepDeff extends WebConnector {

    HoverPage page=new HoverPage();


    @Then("the user move cursor towards the first image")
    public void theUserMoveCursorTowardsTheFirstImage() {
        page.setFirstImageXpath();
    }


}
