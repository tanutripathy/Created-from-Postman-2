package pageObject;

import browserControl.WebConnector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class KeyPressPage extends WebConnector {




    public void presscontrolkey(){
        Actions actions=new Actions(driver);
        actions.keyDown(Keys.CONTROL).perform();
    }
    public void pressescapekey(){
        Actions actions=new Actions(driver);
        actions.keyDown(Keys.BACK_SPACE).perform();
    }
    public void escapeKey(){
        Actions actions=new Actions(driver);
        actions.keyDown(Keys.ESCAPE).perform();
    }
}
