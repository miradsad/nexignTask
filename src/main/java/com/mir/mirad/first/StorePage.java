package com.mir.mirad.first;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class StorePage {
    private final SelenideElement header = $x("//div[@class=\"content-section__page-titles\"]//h1");
    public String getTheHeaderString(){
        return header.shouldBe(visible).getText();
    }

}
