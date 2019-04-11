package com.github.gorovoy456.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;

    @BeforeTest
    public void beforeTest () {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "/home/dhorovyi/IdeaProjects/WebDriverSimple/src/test/resources/chromedriver");

        driver= new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }
    @BeforeMethod
    public void beforeMethod () {
        driver.get("http://google.com/");

    }

    @AfterTest
    public void afterTest () {
//        driver.close();
    }
}


