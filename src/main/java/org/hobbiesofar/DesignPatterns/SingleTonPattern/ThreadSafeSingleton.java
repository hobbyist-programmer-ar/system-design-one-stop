package org.hobbiesofar.DesignPatterns.SingleTonPattern;


class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    /** This causes the entire block to be slowed down. since we are unnecessarily slowing the code where it doesn't have to. */
    public static synchronized ThreadSafeSingleton getInstance() {
        if(instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    /** We can use a technique called the Double-Checked Locking Principle where we put the schronised block in the check. */

    public static synchronized ThreadSafeSingleton getInstanceUsingDCL() {
        if(instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if(instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
