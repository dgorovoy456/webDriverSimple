package com.github.gorovoy456.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FacebookMainPage extends BasePage {


    public FacebookMainPage(WebDriver driver) {
        super(driver);
    }

    public void login(String eMailValue, String pass) {
        WebElement eMail = driver.findElement(By.id("email"));
        eMail.sendKeys(eMailValue);
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys(pass);
        eMail.submit();
    }

    public void goToFrinds() {
        List<WebElement> more = driver.findElements(By.cssSelector("#appsNav>ul>li"));
        more.get(more.size() - 1).click();
    }

    public void clickFriends() {
        WebElement more = driver.findElement(By.xpath("//div[@id='appsNav']/ul/li[14]"));
        more.click();

    }

    public void searchFriends(String findFriend) {
        WebElement more = driver.findElement(By.cssSelector(".wrap>div>span>span>input"));
        more.sendKeys(findFriend);
        more.sendKeys(Keys.ENTER);
    }
}