package com.javafortesters.selectionsdecidions;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class SelectionTest {

    @Test
    public void catOrCats(){

        int numberOfCats = 1;
        assertEquals("1 == cat", "cat", (numberOfCats == 1) ? "cat" : "cats");

        numberOfCats = 0;
        assertEquals("0 == cats", "cats", (numberOfCats == 1) ? "cat" : "cats");

        numberOfCats = 2;
        assertEquals("2 == cats", "cats", (numberOfCats == 1) ? "cat" : "cats");
    }

    @Test
    public void catOrCatsAsMethod(){
        assertEquals("1 ==	cat",	"cat",	catOrCats(1));
        assertEquals("0	 ==	cats",	"cats", catOrCats(0));
        assertEquals("2 ==	cats",	"cats", catOrCats(2));
    }

    private String catOrCats(int catOrCats) {
        return (catOrCats == 1) ? "cat" : "cats";
    }

    @Test
    public void thrutyIf(){
        boolean thruty = true;
        if (thruty) assertTrue(thruty);
        if (thruty) {
            assertTrue(thruty);
            assertFalse(!thruty);
        }
    }

    @Test
    public void switchTest(){
        assertEquals( "United Kingdom", shortCode("UK"));
        assertEquals( "United States", shortCode("US"));
        assertEquals( "United States", shortCode("USA"));
        assertEquals( "France", shortCode("FR"));
        assertEquals( "Sweden", shortCode("SE"));
        assertEquals( "Rest of Word", shortCode("RU"));
        assertEquals( "Rest of Word", shortCode("BY"));
    }

    private String shortCode(String shortCode) {
        String country;
        switch (shortCode.toUpperCase()){
            case "UK":
                country = "United Kingdom";
                break;
            case "US":
                country = "United States";
                break;
            case "USA":
                country = "United States";
                break;
            case "FR":
                country = "France";
                break;
            case "SE":
                country = "Sweden";
                break;
            default:
                country = "Rest of Word";
                break;
        }
        return country;
    }

    @Test
    public void switchTestInteger(){
        assertEquals("One", shortInt(1));
        assertEquals("Two", shortInt(2));
        assertEquals("Three", shortInt(3));
        assertEquals("Four", shortInt(4));
        assertEquals("Too big", shortInt(5));
        assertEquals("Too small", shortInt(0));
        assertEquals("Too small", shortInt(-100));
    }

    private String shortInt(int shortint) {
        String strnumber = "";
        switch(shortint){
            case 1:
                strnumber = "One";
                break;
            case 2:
                strnumber = "Two";
                break;
            case 3:
                strnumber = "Three";
                break;
            case 4:
                strnumber = "Four";
                break;
            default:
                if (shortint > 4) strnumber =  "Too big";
                if (shortint < 1) strnumber = "Too small";
                break;
        }
        return strnumber;
    }
}
