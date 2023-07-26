package com.manav;

public class SIBTest {
    public static final String owner;

    static {
        owner = "Manav";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest(){
        System.out.println("SIB constructor called");
    }

    static {
        System.out.println("SIBTest static 2nd initialization block called");
    }

    public void someMethod(){
        System.out.println("someMethod called");
    }
}