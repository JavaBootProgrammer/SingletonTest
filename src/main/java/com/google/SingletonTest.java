package com.google;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonTest {

    public static void main(String[] args) {
        SpringApplication.run(SingletonTest.class, args);

        Singleton singletonTest = Singleton.getInstance();
        System.out.println(singletonTest.hashCode());

        System.out.println("-------------------------");
        Singleton singletonTest2 = Singleton.getInstance();
        System.out.println(singletonTest2.hashCode());
        System.out.println("-------------------------");
        System.out.println(singletonTest2.hashCode()==singletonTest.hashCode());


    }

}
