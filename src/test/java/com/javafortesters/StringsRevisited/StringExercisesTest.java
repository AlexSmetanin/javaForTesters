package com.javafortesters.StringsRevisited;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StringExercisesTest {

    @Test
    public void tryUsingTheOtherEscapeCharactersOutputToConsole(){
        System.out.println("New lines, and Tabs");
            String firstLine = "|first line\n";
            String secondLine = "|\tsecond line\n";
            String thirdLine = "|\t\tthird line\n";
            String fullString = firstLine + secondLine + thirdLine;
        System.out.println(fullString);

        System.out.println("Carriage return after each word");
        System.out.println("one\rtwo\rthree\rfour\rfive\r");

        System.out.println("Backspace after each word");
        System.out.println("one\btwo\bthree\bfour\bfive\b");

        System.out.println("Quotes and slashes");
        System.out.println("Bob\'s toy said \"DOS uses \'\\\'\"");
    }

    @Test
    public void canConstructStrings(){

        String empty = new String();
        assertThat(empty.length(), is(0));

        char[] cArray = {'2','3'};
        assertThat(new String(cArray), is("23"));
        assertThat(new String(cArray, 1, 1), is("3"));

        byte[] bArray = "hello there".getBytes();
        assertThat(new String(bArray, 3, 3), is("lo "));

        byte[] b8Array = new byte[0];
        try {
            b8Array = "hello there".getBytes("UTF8");
            assertThat(new String(b8Array, 3, 3, "UTF8"), is("lo "));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        String hello = new String("hello" + " " + "there");
        assertThat(hello, is("hello there"));
    }

}
