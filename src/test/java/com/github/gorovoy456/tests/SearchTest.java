package com.github.gorovoy456.tests;

import com.github.gorovoy456.pages.FacebookMainPage;
import com.github.gorovoy456.pages.GooglePage;
import com.github.gorovoy456.pages.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchTest extends BaseTest {

    @Test
    public void simpleSearch () {
//       WebElement search = driver.findElement(By.name("q"));
//       search.sendKeys("facebook");
//       search.sendKeys(Keys.ENTER);
//       search.submit();
        GooglePage google = new GooglePage(driver);
        google.setSearch("facebook");
        google.submitSearch();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.google.com/search?"));

        SearchPage search = new SearchPage(driver);
        search.getListall();

        FacebookMainPage loginIn = new FacebookMainPage(driver);
        loginIn.login("+380939260662", "Qwerty450++");
        loginIn.goToFrinds();
        loginIn.clickFriends();
        loginIn.searchFriends("Vladimir Khadzhynov");



    }
}
