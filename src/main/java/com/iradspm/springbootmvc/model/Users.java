package com.iradspm.springbootmvc.model;

public class Users {
    private int Id;
    private String name;
    private String location;

    //default constructor-no args constructor
    public Users() {
    }

    //all args constructor
    public Users(int id, String name, String location) {
        Id = id;
        this.name = name;
        this.location = location;
    }
    //getters and setters

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    //to string method

    @Override
    public String toString() {
        return "Users{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
