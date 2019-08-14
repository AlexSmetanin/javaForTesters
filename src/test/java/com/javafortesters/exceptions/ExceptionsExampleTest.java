package com.javafortesters.exceptions;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class ExceptionsExampleTest {

    @Test
    public void throwANullPointerException(){
        Integer age = null;
        String ageAsString = null;

        try{
            ageAsString = age.toString();

        }catch (NullPointerException e){    // (ArithmeticException e) // (NoSuchMethodException e)

            System.out.println("getMessage	-	"	+
                    e.getMessage());
            System.out.println("getStacktrace	-	"	+
                    e.getStackTrace());
            System.out.println("printStackTrace");
            e.printStackTrace();

            age = 18;
            ageAsString = age.toString();

        }catch(IllegalArgumentException	e){
            System.out.println("Illegal	Argument:	"	+
                    e.getMessage());
        }

        String yourAge =
                "You are "+ ageAsString +" years old";

        assertEquals("You are 18 years old", yourAge);
    }

    @Test
    public void tryCatchFinallyANullPointerException(){
        Integer age = null;
        String ageAsString;
        String yourAge = "";

        try {
            ageAsString = age.toString();
        }catch (NullPointerException e) {
            age = 18;
            ageAsString = age.toString();
        }finally {
            yourAge = "You are"+age.toString()+" years old";
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void exampleTryCatchFinally(){
        Integer age = null;

        try {
            System.out.println("1. generate a null pointer exception");
            System.out.println(age.toString());
        }catch (NullPointerException e){
            System.out.println("2. handle null pointer exception");
            throw new IllegalArgumentException
                    ("Null pointer become illegal", e);
        }finally {
            System.out.println("3. run code in finally section");
        }
    }

}
