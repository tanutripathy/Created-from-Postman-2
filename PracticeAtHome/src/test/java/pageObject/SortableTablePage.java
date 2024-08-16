package pageObject;

import browserControl.WebConnector;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SortableTablePage extends WebConnector {

    /****************************Locators**************************/

    List<WebElement> rowElement=driver.findElements(By.xpath("//*[@id='table1']/tbody/tr"));
   List<WebElement> columnElement= driver.findElements(By.xpath("//*[@id='table1']/tbody/tr[1]/td"));



    /*****************************Getter&Setter********************/

    public void gettingElementOfTable() {
        System.out.println(rowElement.size());
        int rowSize = rowElement.size();

        System.out.println(columnElement.size());
        int columSize = columnElement.size();
        String tableData ;

        for (int i = 1; i <= rowSize; i++) {
            for (int j = 1; j <= columSize; j++) {

                tableData = driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr["+ i +"]/td["+ j +"]"))
                        .getText();
                System.out.println(tableData);

                System.out.println();


                if (tableData.equals("$100.00")) {
                    System.out.println("it is the correct match");
                }
                else {
                    System.out.println("No match found");
                }
            }

        }
    }
}
