package org.hobbiesofar.DesignPatterns.FactoryMethodPattern;

public class ComputerFactory {
    public static Computer getComputer(String type, String hdd, String cpu, String ram) {
        if("PC".equalsIgnoreCase(type)) {
            return new PC(ram, cpu, hdd);
        } else {
            return new Server(ram, cpu, hdd);
        }
    }
}
