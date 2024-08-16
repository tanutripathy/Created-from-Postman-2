package pageObject;

import browserControl.WebConnector;

public class NotificationPage extends WebConnector {

    /*************************Locators*****************************/

    private String closeButtonXpath="//*[@id=\"flash\"]/a";


    /*********************Getter&Setter**************************/

    public void setCloseButtonXpath(){
        BasePage.findElementByXpath(10,closeButtonXpath).click();
    }
}
