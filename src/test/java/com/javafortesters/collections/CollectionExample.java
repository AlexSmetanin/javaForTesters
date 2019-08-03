package com.javafortesters.collections;

import com.javafortesters.domainentities.User;
import com.sun.javafx.geom.transform.BaseTransform;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

import java.util.*;

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

    @Test
    public void usersCollection() {
        Collection<User> userCol = new ArrayList<User>();

        assertEquals(0, userCol.size());
        assertTrue(userCol.isEmpty());

        User bob = new User("bob", "Passw0rd");
        User eric = new User("eric", "Cha0sTime");

        userCol.add(bob);
        userCol.add(eric);

        assertEquals(2, userCol.size());
        assertFalse(userCol.isEmpty());

        Collection<User> secondUsers = new ArrayList<User>();

        User robert = new User("robert", "9assword");
        User elison = new User("elison","Pas5w0rd");

        secondUsers.add(robert);
        secondUsers.add(elison);
        assertEquals(2, secondUsers.size());

        userCol.addAll(secondUsers);
        assertEquals(4, userCol.size());
        assertTrue(userCol.containsAll(secondUsers));

        secondUsers.removeAll(userCol);
        assertEquals(0,secondUsers.size());

        userCol.clear();
        assertEquals(0, userCol.size());
    }

    @Test
    public void usersList(){
        List<User> someUsers = new ArrayList<User>();

        User bill = new User("bill","qwerty");
        User willy = new User("willy", "123456");

        someUsers.add(willy);
        someUsers.add(0,bill);

        assertEquals(2,someUsers.size());
        assertEquals(0,someUsers.indexOf(bill));
        assertEquals(1,someUsers.indexOf(willy));

        someUsers.remove(0);
        assertEquals(1,someUsers.size());
        assertEquals(0,someUsers.indexOf(willy));
    }

    @Test
    public void usersSet(){
        Set<User> someUsers = new HashSet<User>();

        assertEquals(0, someUsers.size());

        User bob = new User("bob","qwerty");

        someUsers.add(bob);
        assertEquals(1, someUsers.size());

        someUsers.add(bob);
        assertEquals(1, someUsers.size());
    }

    @Test
    public void usersMap(){
        Map<String,User> someUsers = new HashMap<String, User>();

        User bob = new User("bob","qwerty");
        User eric = new User("eric","123456");

        someUsers.put(bob.getUsername(),bob);
        assertEquals(1,someUsers.size());

        someUsers.put(bob.getUsername(),eric);
        assertEquals(1,someUsers.size());
    }
}
