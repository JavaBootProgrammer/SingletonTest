package com.google;

public class Singleton {

    // createt an instante of the singleton class
    private static Singleton instance = new Singleton();
    // private constructor
    private Singleton() {
        System.out.println("Singleton is created");
    }
    // get the object
    public static Singleton getInstance() {
        return instance;
    }
}
