package pageObject;

import browserControl.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderPage extends WebConnector {

    /*******************Locators*******************/

WebElement element=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/input"));



    /******************Getter&Setter*****************/

    public void moveSlider(){
        Actions actions=new Actions(driver);
        actions.dragAndDropBy(element,215,171).build().perform();
    }
}
