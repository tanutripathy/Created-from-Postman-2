package stepDefinition;

import browserControl.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.ContextClickPage;

import java.time.Duration;

public class ContextClickStepDeff extends WebConnector {

    ContextClickPage clickPage=new ContextClickPage();


    @And("the user right click on the page")
    public void theUserRightClickOnThePage() {
        clickPage.setRightClickXpath();

    }
    @Then("the user can see {string} in the context menu page")
    public void theUserCanSeeInTheContextMenuPage(String expectedtext) {
        Alert alert=new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        String actualtext= alert.getText();
        Assert.assertEquals(expectedtext,actualtext);


    }

    @Then("the user click OK of the alert popup")
    public void theUserClickOKOfTheAlertPopup() {
        Alert alert =new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }


}
