package com.mir.mirad;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

abstract public class BaseTest {
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 2000;
        Configuration.headless = false;

    }
    @Before
    public void init(){
        setUp();
    }
    @After
    public void tearDown(){
        Selenide.closeWebDriver();
    }
}
