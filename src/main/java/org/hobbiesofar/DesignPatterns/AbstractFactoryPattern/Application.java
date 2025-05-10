package org.hobbiesofar.DesignPatterns.AbstractFactoryPattern;

class Application {
    public GUIFactory getGUIComponent(String type) {
        GUIFactory factory = null;
        if (type.equalsIgnoreCase("MAC")) {
            factory = new MacFactory();
        } else if(type.equalsIgnoreCase("WINDOWS")) {
            factory = new WinFactory();
        }

        return factory;
    }
}
