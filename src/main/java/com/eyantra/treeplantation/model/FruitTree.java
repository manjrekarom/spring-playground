package com.eyantra.treeplantation.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;

//@Data
//@Entity
@Component
public class FruitTree implements Tree {
//    String fruitColor;
//    int fruitSize;
//
//    void getItem()


    @Override
    public String getProduce() {
        return "I produce Fruits";
    }
}
