package pageObject;

import browserControl.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class EnterAdPage extends WebConnector {

   /*********************Locators****************/

private String pagemessage="//*[@id=\"modal\"]/div[2]/div[3]/p";

private String exitCloseXpath="";


   /******************Getter&Setter**********/

  public void setPagemessage(){
      BasePage.findElementByXpath(20,pagemessage).click();
  }


}
