package com.github.gorovoy456.tests;

import com.github.gorovoy456.pages.GooglePage;
import com.github.gorovoy456.pages.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

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
        SearchPage searchPage = new SearchPage(driver);

        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.google.com/search?"));



    }

    @Test
    public void simpleSearch2 () {


        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.google.com/search?"));



    }
}
