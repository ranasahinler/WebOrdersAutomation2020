package com.weborders.pages;

import com.weborders.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
/*
it meant to be extended
 */
public class AbstractBasePage {
    protected WebDriver driver = Driver.getDriver();
    public AbstractBasePage(){
        PageFactory.initElements(driver,this);
    }
}
