package com.driver;

public class Main {
  public static void main(String[] args){
      RWOnly ans= new RWOnly();
//      ans.name= "shad";
//      System.out.println(name);
//      cannot directly assign names as there is an error
     ans.setName("shad");
     String reqans= ans.getName();

  }
}