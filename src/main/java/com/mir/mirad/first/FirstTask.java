package com.mir.mirad.first;

import com.mir.mirad.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTask extends BaseTest {
    private final String MY_URL = "https://nexign.com/ru";
    @Test
    public void testTheStoreOpening(){
        MainPage mainPage = new MainPage(MY_URL);
        mainPage.clickTheStoreButton().clickDeveloperStore();
        StorePage storePage = new StorePage();
        Assertions.assertEquals(storePage.getTheHeaderString(),"Nexign Store");
    }

}
