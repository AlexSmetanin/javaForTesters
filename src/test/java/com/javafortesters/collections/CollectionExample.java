package com.javafortesters.collections;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CollectionExample {

    @Test
    public void for2WhileLoop(){

        String[] someDays = {"Tuesday","Thursday",
                "Wednesday","Monday",
                "Saturday","Sunday",
                "Friday"};

        List<String> days = Arrays.asList(someDays); // convert Array to List

        int forwhile;
        for (forwhile = 0; !days.get(forwhile).equals("Monday"); forwhile++) {
        }
        assertEquals("Monday is at position 3", 3, forwhile);
    }
}
