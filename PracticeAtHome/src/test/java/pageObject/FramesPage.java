package pageObject;

import browserControl.WebConnector;
import io.opentelemetry.context.internal.shaded.WeakConcurrentMap;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class FramesPage extends WebConnector {
    /**************************Locators************************/

   // private String frameXpath="tinymce";
    private String iframesXpathclick="iFrame";


    /****************Getter&Setter*********************/

    public void setframeXpath(String addtext){
        driver.switchTo().frame("mce_0_ifr");
        Actions actions=new Actions(driver);
        actions.sendKeys(addtext).perform();
    }
    public void setIframesXpathclick(){
        driver.findElement(By.linkText(iframesXpathclick)).click();
    }
}
