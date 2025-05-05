package org.hobbiesofar.DesignPatterns.SingleTonPattern;


/**
This is similar to the Eager initialization we did but the new instance created is in a static block with an exception handler.
**/
class StaticBloxckInitialization {
    private static StaticBloxckInitialization instance;

    private StaticBloxckInitialization(){};

    static {
        try {
            instance = new StaticBloxckInitialization();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured while createing the instance");
        }
    }

    public static StaticBloxckInitialization getInstance() {
        return instance;
    }
}
