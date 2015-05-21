package com.example.reminder;

/**
 * Created by Мария on 21.05.2015.
 */
public class Location {
    int id;
    int idReminder;
    String name;
    String address;

    public Location(String name, String address) {
        this.name = name;
        this.address = address;
        //id = ???
        //idReminder = ???
    }

    public Location() {
        id = 0;
        idReminder = 0;
        name = "";
        address = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdReminder() {
        return idReminder;
    }

    public void setIdReminder(int idReminder) {
        this.idReminder = idReminder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
