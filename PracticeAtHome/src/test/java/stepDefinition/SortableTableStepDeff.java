package stepDefinition;

import browserControl.WebConnector;
import io.cucumber.java.en.And;
import pageObject.SortableTablePage;

public class SortableTableStepDeff extends WebConnector {

    SortableTablePage tablePage=new SortableTablePage();


    @And("the user fetch all data from table")
    public void theUserFetchAllDataFromTable() {
        tablePage.gettingElementOfTable();
    }
}
