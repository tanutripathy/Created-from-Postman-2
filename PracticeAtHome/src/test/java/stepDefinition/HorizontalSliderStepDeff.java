package stepDefinition;

import browserControl.WebConnector;
import io.cucumber.java.en.Then;
import pageObject.HorizontalSliderPage;

public class HorizontalSliderStepDeff extends WebConnector {

    HorizontalSliderPage sliderPage=new HorizontalSliderPage();


    @Then("the user drag the slider")
    public void theUserDragTheSlider() {
        sliderPage.moveSlider();
    }
}
