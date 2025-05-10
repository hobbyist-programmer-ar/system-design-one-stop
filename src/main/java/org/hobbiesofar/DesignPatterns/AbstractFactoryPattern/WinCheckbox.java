package org.hobbiesofar.DesignPatterns.AbstractFactoryPattern;

class WinCheckbox implements Checkbox{

    @Override
    public String checkBoxStyle() {
        return "Windows Checkbox";
    }
}
