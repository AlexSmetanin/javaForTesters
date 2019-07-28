package com.javafortesters.domainentities;

public class User {

    private String username;
    private String password;

    /*public User(){                                    // конструктор по-умолчанию без агрументов
        username = "username";
        password = "password";
    }*/

    public User(){                                      // конструктор по-умолчанию без аргументов, который
        this("username","password");  // вызывает коснтруктор с аргументами
    }

    public User(String username, String password){      // конструктор с агрументами
        this.username = username;                       // this. обращается к полю текущего объекта
        this.password = password;
    }

    public String getUsername() {                       // getter - получает значение переменной или поля
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
