package pageObject;

import browserControl.WebConnector;

public class AddAndDeletePage extends WebConnector {
    /**************************Locators*************************/
    private String addXpath="//*[@id=\"content\"]/div/button";
    private String deleteXpath="//*[@id=\"elements\"]/button";



    /**************Getter&Setters********************/

    public void setAddXpath(){
        BasePage.findElementByXpath(10,addXpath).click();
    }
    public void setDeleteXpath(){
        BasePage.findElementByXpath(10,deleteXpath).click();
    }


}
