package com.midominio.singleton.thread;

import com.midominio.singleton.model.SingletonClass;

/**
 * This class create a instance in singleton class in a thread.
 *
 * @version 1.0
 * @author David
 */
public class BooThread implements Runnable{


    /**
     * Create a new instance in a new thread.
     */
    @Override
    public void run() {
        SingletonClass singleton = SingletonClass.getSingletonThreads("BOO");

        System.out.println("Creating a instance with id class: BOO");
        System.out.println("Id class = " + singleton.getId());
    }
}
