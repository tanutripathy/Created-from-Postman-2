package stepDefinition;

import browserControl.WebConnector;
import io.cucumber.java.en.And;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.NotificationPage;

import java.io.NotActiveException;
import java.time.Duration;

public class NotificationStepDeff extends WebConnector {

NotificationPage page=new NotificationPage();


    @And("the user click on close notification")
    public void theUserClickOnCloseNotification() {
        page.setCloseButtonXpath();

    }
}
