package com.driver;

public class RWOnly {
    private String name;
    public RWOnly(String name){
        this.name= name;
    }
    public void setName(String name){
        this.name= name;
    }
    public String getName(){
        this.name= name;
        return name;
    }

}
