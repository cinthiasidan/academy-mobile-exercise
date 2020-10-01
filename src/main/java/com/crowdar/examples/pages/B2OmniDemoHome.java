package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseMobile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

/**
 * This class is based in the old format of Page objects. See the package services in the new format.
 */
public class B2OmniDemoHome extends PageBaseMobile {


    public B2OmniDemoHome(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }



}
