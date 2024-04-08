package com.midominio.singleton.model;

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
        return isUniqueInstance(id);
    }

    /**
     * To get unique instance of this class when work in multi-thread.
     *
     * @return unique class of SingletonClass.
     */
    public synchronized static SingletonClass getSingletonThreads(String id) {
        return isUniqueInstance(id);
    }

    /**
     * Method to validate if the instance was created.
     *
     * @param id of the class.
     * @return the instance of this class.
     */
    private static SingletonClass isUniqueInstance(String id) {
        return (singleton == null)
                ? singleton = new SingletonClass(id)
                : singleton;
    }

    // Getters and setters.

    public String getId() {
        return id;
    }
}
