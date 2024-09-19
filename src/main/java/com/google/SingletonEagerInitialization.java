package com.google;

public class SingletonEagerInitialization {

    // createt an instante of the singleton class
    private static SingletonEagerInitialization instance = new SingletonEagerInitialization();
    // private constructor
    private SingletonEagerInitialization() {
        System.out.println("Singleton is created");
    }
    // get the object
    public static SingletonEagerInitialization getInstance() {
        return instance;
    }
}
