package com.eyantra.treeplantation.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

    private Engine engine;

    private Transmission transmission;

    public Car(@Autowired @Qualifier("genericEngine") Engine engine,
               @Autowired @Qualifier("genericTransmission") Transmission transmission) {
        this.engine = engine;
        this.transmission = transmission;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void drive() {
        System.out.println("Chal rha hai");
    }

    @Override
    public String toString() {
        return String.format("%s %s", engine.toString(), transmission.toString());
    }
}
