package com.example.reminder;

import java.sql.Time;
import java.util.Date;

/**
 * Created by Мария on 21.05.2015.
 */
public class User {
    int id;
    String name;
    String password;
    String login;

    public User(String name, String password, String login) {
        this.name = name;
        this.password = password;
        this.login = login;
    }

    public User() {
        name = "";
        password = "";
        login = "";
        id = 0;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return name;
    }

    public String getUserPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.name = userName;
    }

    public void setUserPassword(String userPassword) {
        this.password = userPassword;
    }

    public void setLogin(String login) {
        login = login;
    }



}
