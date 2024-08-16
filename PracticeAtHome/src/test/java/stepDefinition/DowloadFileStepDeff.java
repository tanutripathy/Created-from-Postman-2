package stepDefinition;

import browserControl.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.remote.codec.w3c.W3CHttpCommandCodec;
import pageObject.DowlaodFilePage;

public class DowloadFileStepDeff extends WebConnector {

    DowlaodFilePage filePage=new DowlaodFilePage();


    @Then("the user click on photo.JPG in the page")
    public void theUserClickOnPhotoJPGInThePage() throws InterruptedException {
        filePage.setDowloadfilepath();
    }



}
