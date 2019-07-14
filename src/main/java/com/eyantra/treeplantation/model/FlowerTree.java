package com.eyantra.treeplantation.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;

//@Data
//@Entity
@Component
public class FlowerTree implements  Tree {
//    String flowerColor;
//    String flowerSmell;

    @Value(value = "Chameli")
    String name;
//
//    @Value()
//    public FlowerTree(String name) {
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getProduce() {
        return "I produce flowers";
    }
}
