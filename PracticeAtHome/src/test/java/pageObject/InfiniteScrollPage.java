package pageObject;

import browserControl.WebConnector;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.codec.w3c.W3CHttpCommandCodec;

public class InfiniteScrollPage extends WebConnector {

    /*********************Locators**********************/


    /*************************Getter&Setters************************/

    public void scrollDown(){
       JavascriptExecutor jse=(JavascriptExecutor)driver;
       jse.executeScript("window.scrollBy(0,600)");

    }
}
