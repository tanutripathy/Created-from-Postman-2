package stepDefinition;

import browserControl.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Alert;
import pageObject.EnterAdPage;

public class EntryAdStepDeff extends WebConnector {

    EnterAdPage adPage=new EnterAdPage();

    @And("the user click on close add")
    public void theUserClickOnCloseAdd() {
        adPage.setPagemessage();
    }


}
