package com.midominio.singleton;

import com.midominio.singleton.model.SingletonClass;
import com.midominio.singleton.thread.BooThread;
import com.midominio.singleton.thread.FooThread;

/**
 * Main class to show the functionality of the singleton pattern.
 *
 * @version 1.0
 * @author David.
 */
public class SingletonApp {

    /**
     * Method to start the application.
     *
     * @param args params.
     */
    public static void main(String[] args) {

        SingletonClass singleton1 = SingletonClass.getSingleton("FOO");
        SingletonClass singleton2 = SingletonClass.getSingleton("BOO");
        Thread t1 = new Thread(new BooThread());
        Thread t2 = new Thread(new FooThread());

        System.out.println("Mono-thread.");
        System.out.println("--------------------------------------");
        System.out.println("Creating a instance with id class: FOO");
        System.out.println("Id class = " + singleton1.getId());
        System.out.println("--------------------------------------");
        System.out.println("Creating a instance with id class: BOO");
        System.out.println("Id class = " + singleton1.getId());
        System.out.println("--------------------------------------");
        System.out.println("Multi-thread.");
        System.out.println("--------------------------------------");
        System.out.println("Creating a thread...");
        t1.start();
        System.out.println("--------------------------------------");
        System.out.println("Creating a thread...");
        t2.start();
        System.out.println("--------------------------------------");

    }
}
