package pageObject;

import browserControl.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage extends WebConnector {

    /************************Locators********************/

    WebElement columnAXpath = driver.findElement(By.xpath("//div[@id='column-a']"));
    WebElement columnBXpath = driver.findElement(By.xpath("//div[@id='column-b']"));


    /*********************Getter&Setters*****************/

    public void dragDrop() {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(columnAXpath, columnBXpath).perform();
    }

    public void DragAndDrop(){
        Actions actions=new Actions(driver);
        actions.dragAndDrop(columnBXpath,columnAXpath).perform();

    }

}