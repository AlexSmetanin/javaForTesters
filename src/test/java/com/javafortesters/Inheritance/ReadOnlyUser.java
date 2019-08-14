package com.javafortesters.Inheritance;

import com.javafortesters.domainentities.User;

public class ReadOnlyUser extends User {

    @Override
    public String getPermission(){
        return "ReadOnly";
    }
}
