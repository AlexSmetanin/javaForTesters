package com.javafortesters.Inheritance;

import com.javafortesters.domainentities.User;
import com.javafortesters.domainobject.TestAppEnv;
import org.junit.Test;

public class EnvironmentUser extends User {

    public String getUrl(){
        return TestAppEnv.getURL();
    }
}
