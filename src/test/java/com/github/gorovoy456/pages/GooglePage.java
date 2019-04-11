package com.github.gorovoy456.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.util.List;

public class  GooglePage extends BasePage {

    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public void setSearch (String value) {
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys(value);



    }

    public void submitSearch () {
        WebElement search = driver.findElement(By.name("q"));
        search.submit();

    }


}


