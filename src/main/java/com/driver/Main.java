package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        //obj.name = "Vishal"; // java: name has private access in com.driver.RWOnly
        //System.out.println(obj.name);
        //java: name has private access in com.driver.RWOnly

        obj.setName("vishal");
        System.out.println("Name : "+obj.getName());
    }
}