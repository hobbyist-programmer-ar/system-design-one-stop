package org.hobbiesofar.DesignPatterns.AbstractFactoryPattern;

class WinButton implements Button{

    @Override
    public String paint(){
        return "Windows Button";
    }
}
