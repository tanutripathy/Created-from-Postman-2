package stepDefinition;

import browserControl.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageObject.UploadFilePage;

public class UploadFileStepDeff extends WebConnector {

    UploadFilePage page=new UploadFilePage();

    @Then("the user select he file to  upload")
    public void theUserSelectHeFileToUpload() {
        page.setChoseFileXpath();
    }
    @And("the user click on upload button")
    public void theUserClickOnUploadButton() {
        page.setUploadButtonXpath();

    }

    @Then("the user can see {string} in the page")
    public void theUserCanSeeInThePage(String expectedtext) {
        Assert.assertTrue(driver.getPageSource().contains(expectedtext));
    }


}
