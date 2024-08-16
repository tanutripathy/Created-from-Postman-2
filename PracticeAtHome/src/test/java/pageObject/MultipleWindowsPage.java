package pageObject;

import browserControl.WebConnector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindowsPage extends WebConnector {

    /***********************Locators*****************************/

    private String clickHereXpath="//*[@id=\"content\"]/div/a";



    /********************Getter&Setter******************************/

    public void setClickHereXpath(){
        BasePage.findElementByXpath(10,clickHereXpath).click();
    }
    public void  selectAll(){
        Actions actions=new Actions(driver);
       Set<String> windowsHandle = driver.getWindowHandles();
        System.out.println(windowsHandle);
        Iterator<String> iterator= windowsHandle.iterator();
        String firstwindow=iterator.next();
        String newWindow=iterator.next();

        driver.switchTo().window(newWindow);
        actions.keyDown(Keys.CONTROL).sendKeys("a").perform();
    }
}
