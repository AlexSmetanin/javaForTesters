package com.javafortesters.exceptions;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class ExceptionsExampleTest {

    @Test
    public void throwANullPointerException(){
        Integer age = null;
        String ageAsString = age.toString();
        String yourAge = "You are "+ageAsString+" years old";
        assertEquals("You are 18 years old", yourAge);
    }

}
