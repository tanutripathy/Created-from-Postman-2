package pageObject;

import browserControl.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextClickPage extends WebConnector {

    /**************************Locators**********************/

    WebElement rightClickXpath=driver.findElement(By.xpath("//div[@id='hot-spot']"));



    /*********************Getter&Setters************************/

    public void setRightClickXpath(){
        Actions actions=new Actions(driver);
        actions.contextClick(rightClickXpath).perform();
    }

}
