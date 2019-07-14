package com.eyantra.treeplantation.model;

public class Transmission {

    public Transmission(String system) {
        this.system = system;
    }

    String system;

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    @Override
    public String toString() {
        return String.format("%s", system);
    }
}
