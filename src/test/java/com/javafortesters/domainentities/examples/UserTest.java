package com.javafortesters.domainentities.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UserTest {

    @Test
    public void canConstructANewUser(){
        User user = new User();
    }

    @Test
    public void userHasDefaultUsernameAndPassword(){
        User user = new User();

        assertEquals("default username expacted",
                "username",
                user.getUsername());

        assertEquals("default password expacted",
                "password",
                user.getPassword());
    }

    /* @Test
    public void userCanChangeDefaultValues(){ // username and password must be public
        User auser = new User();
        auser.username = "bob";
        assertEquals("not default username", "bob", auser.username);
    }*/

    @Test
    public void canCanstructorWithUsernameAndPassword(){
        User user = new User("admin","pA55w0rD");

        assertEquals("given username expected",
                "admin",
                user.getUsername());

        assertEquals("given password expected",
                "pA55w0rD",
                user.getPassword());
    }

    @Test
    public void canSetPasswordAfterConstructed(){
        User user = new User();

        user.setPassword("PaZZwor6");

        assertEquals("setter password expected", "PaZZwor6", user.getPassword());
    }
}
