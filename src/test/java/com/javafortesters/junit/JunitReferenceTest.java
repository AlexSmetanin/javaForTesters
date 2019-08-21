package com.javafortesters.junit;

import com.javafortesters.domainentities.interim.exceptions.custom.InvalidPassword;
import com.javafortesters.domainentities.interim.exceptions.custom.User;
import org.junit.*;

import static org.junit.Assert.*;

public class JunitReferenceTest {

    @BeforeClass
    public static void runOncePerClassBeforeAnyTests(){
        System.out.println("@BeforeClass method");
    }

    @Before
    public void runBeforeEveryTestMethod(){
        System.out.println("@Before each method");
    }

    @Test
    public void thisTestWillNeverFail(){
    }

    @Test (expected=InvalidPassword.class)
    public void expectInvalidPasswordException() throws InvalidPassword {
        User user = new User("username", "<6");
    }



    @Test(expected=AssertionError.class)
    public void junitFailWithDescription(){
        fail("fail always fails");
    }

    @Test(expected=AssertionError.class)
    public void junitFailWithoutDescription(){
        fail();
    }

    @Ignore
    @Test
    public void thisTestIsIgnored(){
        throw new NullPointerException();
    }

    @Ignore("Because it is not finished yet")
    @Test
    public void thisTestIsIgnoredBecauseItIsNotFinished(){
    }

    @After
    public void runAfterEveryTestMethod(){
        System.out.println("@After each method");
    }

    @AfterClass
    public static void runOncePerClassAfterAllTests(){
        System.out.println("@AfterClass method");
    }
}
