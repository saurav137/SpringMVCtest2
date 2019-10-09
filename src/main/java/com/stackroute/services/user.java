package com.stackroute.services;

public class user {
    public  String name;
    private String password;
    public user(String name,String pass){
       this.name=name;
       this.password=pass;
    }

    public String getName() {
        return name;
    }
}
