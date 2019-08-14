package com.javafortesters.Inheritance;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ReadOnlyUserTest {

    @Test
    public void readOnlyUserPrivsAndDefaults(){
        ReadOnlyUser rod = new ReadOnlyUser();
        assertEquals("ReadOnly", rod.getPermission());
        assertEquals("username", rod.getUsername());
        assertEquals("password", rod.getPassword());
    }

}
