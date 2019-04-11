package com.github.gorovoy456.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);

    }

//    public void goToYoutube () {
//        WebElement youtube = driver.findElement(By.id("gsr"));
//        youtube.submit();
//    }
public void getListall(){
    List<WebElement> searchXpath = driver.findElements(By.cssSelector(".rc>.r>a"));
    searchXpath.get(0).click();



}
}

