package org.hobbiesofar.DesignPatterns.SingleTonPattern;


/**
In Eager intialization the instance of the singleton class is created at the time of class loading. The only drawback here is that the instance of the class is ready even if the class using it is not. Incase the loading time for the instance is high we can use this like when we are creating a file system and a database connection. We will be calling the getInstance() method to get the instance of the class rather than the consdtrucotr whic is a private method.
**/
class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton(){};

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}
