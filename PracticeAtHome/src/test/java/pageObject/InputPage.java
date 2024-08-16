package pageObject;

import browserControl.WebConnector;

public class InputPage extends WebConnector {
    /**********************Locators*************************/

    private String inputXpath="//input[@type='number']";

    /************************Getter&Setters*****************/




    public void setInputXpath(String num){
        BasePage.findElementByXpath(10,inputXpath).sendKeys(num);
    }
}
