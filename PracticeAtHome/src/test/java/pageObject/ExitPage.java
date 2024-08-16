package pageObject;

import browserControl.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ExitPage extends WebConnector {

    /********************Locators**********************/

    WebElement moveCursorXpath= driver.findElement(By.xpath("//div[@id='flash-messages']"));

    private String closeButtonXpath="//*[@id=\"ouibounce-modal\"]/div[2]/div[3]/p";



    /*****************Getter&Setter*********************/

     public void setMoveCursor() {
         Actions actions = new Actions(driver);
         actions.moveToElement(moveCursorXpath).build().perform();
     }
     public void setCloseButtonXpath(){
         BasePage.findElementByXpath(10,closeButtonXpath).click();
     }
}
