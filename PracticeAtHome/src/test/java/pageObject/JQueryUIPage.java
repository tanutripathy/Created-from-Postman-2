package pageObject;

import browserControl.WebConnector;
import org.openqa.selenium.By;

public class JQueryUIPage extends WebConnector {

    /******************Locators*********************/

    private String enabledButtonXpath="//*[@id=\"ui-id-3\"]/a";
    private String JQueryButton="//*[@id=\"ui-id-8\"]/a";


   public void setEnabledButtonXpath(){
        BasePage.findElementByXpath(10,enabledButtonXpath).click();
    }

    public void  JQueryUIButton(){
       BasePage.findElementByXpath(10,JQueryButton).click();
    }
}
