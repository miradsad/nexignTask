package com.mir.mirad.second;

import com.mir.mirad.BaseTest;
import com.mir.mirad.first.MainPage;
import com.mir.mirad.first.StorePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SecondTask extends BaseTest {
    private final String MY_URL = "https://nexign.com/ru";
    @Test
    public void countTheWord(){
        MainPage mainPage = new MainPage(MY_URL);
        long c = mainPage.nordCounter();
        System.out.println(c);
        Assertions.assertEquals(1,c);

    }

}
