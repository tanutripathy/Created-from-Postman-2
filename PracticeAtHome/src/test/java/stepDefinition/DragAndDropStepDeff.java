package stepDefinition;

import browserControl.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObject.ContextClickPage;
import pageObject.DragAndDropPage;

public class DragAndDropStepDeff extends WebConnector {

    DragAndDropPage dropPage=new DragAndDropPage();


    @Then("the user drag columnA to column B")
    public void theUserDragColumnAToColumnB() {
        dropPage.dragDrop();
    }

    @And("the user drag columnB to columnA and drop")
    public void theUserDragColumnBToColumnAAndDrop() {
        dropPage.DragAndDrop();
    }



}
