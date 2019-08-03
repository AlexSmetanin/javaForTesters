package com.javafortesters.arraysiteration;

import com.javafortesters.domainentities.User;
import org.junit.Test;
import java.util.Arrays;

import java.lang.reflect.Array;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class ArrayExampleTest {

    @Test
    public void simpleArrayExample(){
        String[] numbers0123 = {"zero","one","two","three"};

        for (String numberText : numbers0123) {
            System.out.println(numberText);
        }

        assertEquals("zero", numbers0123[0]);
        assertEquals("three", numbers0123[3]);
    }

    @Test
    public void createUsersArray(){
        User[] users = new User[3];

        users[0] = new User("bob","1qazxsw2");
        users[1] = new User("alex","123456");
        users[2] = new User("kent","qwerty");

        assertEquals("bob",users[0].getUsername());
        assertEquals("alex",users[1].getUsername());
        assertEquals("kent",users[2].getUsername());

        for(User currentuser : users) {
            System.out.println(currentuser.getUsername());
        }
    }

    @Test
    public void createUsersArray100(){
        User[] users = new User[100];

        for(int i = 0; i < 100 ; i++) {
            int userId = i+1;
            users[i] = new User("user"+userId,"password"+userId);
            System.out.println(users[i].getUsername()+" "+users[i].getPassword());
        }

        assertTrue(users.length==100);

        int i = 1;
        for (User aUser : users) {
            assertEquals("user"+i+" "+"password"+i,aUser.getUsername()+" "+aUser.getPassword());
            i++;
        }
    }

    @Test
    public void sortArray(){
        String[] workdays = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
        Arrays.sort(workdays);
        assertEquals("Friday",workdays[0]);
        assertEquals("Monday",workdays[1]);
        assertEquals("Thursday",workdays[2]);
        assertEquals("Tuesday",workdays[3]);
        assertEquals("Wednesday",workdays[4]);
    }

    @Test
    public void sortArrayMixCase(){
        String[] workdays = {"monday","Tuesday","Wednesday","thursday","Friday"};
        Arrays.sort(workdays);
        assertEquals("Friday",workdays[0]);
        assertEquals("Tuesday",workdays[1]);
        assertEquals("Wednesday",workdays[2]);
        assertEquals("monday",workdays[3]);
        assertEquals("thursday",workdays[4]);
    }

    @Test
    public void arrayTriade(){
        int[][] multi = new int[16][];
        for(int row=0; row < multi.length; row++) {
            multi[row] = new int[row+1];
            for(int col=0; col<multi[row].length; col++){
                multi[row][col] = col;
            }
        }
        print2DIntArray(multi);
    }

    public void print2DIntArray(int [][]multi){
        for(int[] outer : multi){
            if(outer==null){
                System.out.print("null");
            }else{
                for(int inner : outer){
                    System.out.print(inner + ",");
                }
            }
            System.out.println("");
        }
    }

}
