package com.midominio.singleton.thread;

import com.midominio.singleton.model.SingletonClass;

/**
 * This class create a instance in singleton class in a thread.
 *
 * @version 1.0
 * @author David
 */
public class FooThread implements Runnable{

    /**
     * Create a new instance in a new thread.
     */
    @Override
    public void run() {
        SingletonClass singleton = SingletonClass.getSingletonThreads("FOO");

        System.out.println("Creating a instance with id class: FOO");
        System.out.println("Id class = " + singleton.getId());
    }
}
