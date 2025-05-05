package org.hobbiesofar.DesignPatterns.FactoryMethodPattern;

public class PC extends Computer {
    private String ram;
    private String hdd;
    private String cpu;

    public PC(String ram, String cpu, String hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }
}
