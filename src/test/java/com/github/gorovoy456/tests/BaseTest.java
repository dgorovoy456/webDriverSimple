package com.github.gorovoy456.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    public WebDriver driver;

    @BeforeTest
    public void beforeTest () {
        System.setProperty("webdriver.chrome.driver",    getClass().getClassLoader().getResource("chromedriver").getPath());
        driver= new ChromeDriver();

    }
    @BeforeMethod
    public void beforeMethod () {
        driver.get("http://google.com/");

    }

    @AfterTest
    public void afterTest () {
        driver.close();
    }
}


