package com.mir.mirad.first;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    public MainPage(String url) {
        open(url);
    }
    private final SelenideElement storeButton = $x("//li[@class=\"menu-item menu-item--expanded store\"]");
    private final SelenideElement devStoreButton = $x("//li[@class='menu-item']//a[@href=\"/ru/store\"]");

    public MainPage clickTheStoreButton(){
        storeButton.shouldBe(visible).click();
        return this;
    }
    public MainPage clickDeveloperStore(){
        devStoreButton.shouldBe(visible).click();
        return this;
    }
    public long nordCounter(){
        String pageContent = Selenide.$("body").getText();
        pageContent = pageContent.toLowerCase();
        long nordCount = pageContent.split("nord").length - 1;
        return nordCount;
    }
}
