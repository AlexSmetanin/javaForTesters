package com.javafortesters.junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyFirstAssertDotTest {

    @Test
    public void canAddTwoPlusTwo(){

        int answer = 2 + 2;
        assertEquals("2+2=4", 4, answer);
    }
}
