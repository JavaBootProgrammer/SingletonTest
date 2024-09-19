package com.google;

public class SingletonLazyInitialization {

    // create an instante of the singleton class
    private static SingletonLazyInitialization instance;
    // private constructor

    private SingletonLazyInitialization() {
        System.out.println("SingletonLazyInitialization");
    }
    // get the object

    public static synchronized SingletonLazyInitialization getInstance() {
        if (instance == null) {
            instance = new SingletonLazyInitialization();
        }
        return instance;
    }


}
