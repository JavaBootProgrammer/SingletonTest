package com.google;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonTest {

    public static void main(String[] args) {


//        ---------SingletonEagerInitialization----------------
        SpringApplication.run(SingletonTest.class, args);
//
//        SingletonEagerInitialization singletonTest = SingletonEagerInitialization.getInstance();
//        System.out.println(singletonTest.hashCode());
//
//        System.out.println("-------------------------");
//        SingletonEagerInitialization singletonTest2 = SingletonEagerInitialization.getInstance();
//        System.out.println(singletonTest2.hashCode());
//        System.out.println("-------------------------");
//        System.out.println(singletonTest2.hashCode()==singletonTest.hashCode());

        SingletonLazyInitialization singletonLazyInitialization = SingletonLazyInitialization.getInstance();
        System.out.println(singletonLazyInitialization.hashCode());

        SingletonLazyInitialization singletonLazyInitialization2 = SingletonLazyInitialization.getInstance();
        System.out.println(singletonLazyInitialization2.hashCode());

        System.out.println(singletonLazyInitialization == singletonLazyInitialization2);
    }

}
