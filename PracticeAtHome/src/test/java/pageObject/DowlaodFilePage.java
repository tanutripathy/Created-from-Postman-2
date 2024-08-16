package pageObject;

import browserControl.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

public class DowlaodFilePage extends WebConnector {

    /********************Loacators*********************/

    private String dowloadfilepath="photo1.JPG";

    private String dowloadpath2="-1000177953-190624-16460703127-IMAGE-P000000001000177953.jpeg";

    /************************Getter&Setters*********************/

    public void setDowloadfilepath() {

        driver.findElement(By.linkText(dowloadfilepath)).click();

    }
}
