package com.midominio.singleton.model;

import jdk.internal.org.objectweb.asm.commons.JSRInlinerAdapter;

/**
 * This class implement the singleton pattern design.
 *
 * @version 1.0
 * @author David G.
 */
public class SingletonClass {

    /**
     * Variable that storage the unique instance of this class.
     */
    private static SingletonClass singleton;

    /**
     * Id to validate the instance of the application.
     */
    private String id;

    /**
     * Private constructor to block the creation with new.
     */
    private SingletonClass(String id) {
        this.id = id;
    }

    /**
     * To get unique instance of this class when work in mono-thread.
     *
     * @return unique class of SingletonClass.
     */
    public static SingletonClass getSingleton(String id) {
        return (singleton == null)
                ? singleton = new SingletonClass(id)
                : singleton;
    }

    /**
     * To get unique instance of this class when work in multi-thread.
     *
     * @return unique class of SingletonClass.
     */
    public synchronized static SingletonClass getSingletonThreads(String id) {
        if (singleton == null){
            synchronized (SingletonClass.class) {
                if (singleton == null) {
                    singleton = new SingletonClass(id);
                }
            }
        }
        return singleton;
    }

    // Getters and setters.

    public String getId() {
        return id;
    }
}
