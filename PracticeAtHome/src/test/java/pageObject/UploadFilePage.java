package pageObject;

import browserControl.WebConnector;

public class UploadFilePage extends WebConnector {

    /*******************Locators*********************/

    private String choseFileXpath="//input[@id='file-upload']";

    private String uploadButtonXpath="//input[@id='file-submit']";

    /**************Getter&Setters*****************/

    public void setChoseFileXpath(){
        BasePage.findElementByXpath(10,choseFileXpath).sendKeys("D:\\Downloads\\photo1.jpg");
    }

    public void setUploadButtonXpath(){
        BasePage.findElementByXpath(10,uploadButtonXpath).click();
    }
}
