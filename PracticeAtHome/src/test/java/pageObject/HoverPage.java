package pageObject;

import browserControl.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverPage extends WebConnector {

    /***********************Locators*****************/



    WebElement firstImageXpath= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/img"));






    /******************Getter&Setter*********************/

    public void  setFirstImageXpath(){
        Actions actions=new Actions(driver);
        actions.moveToElement(firstImageXpath).perform();
    }

}
