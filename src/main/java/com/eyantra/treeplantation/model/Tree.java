package com.eyantra.treeplantation.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

//@Data
//@Entity(name = "tree")
public interface  Tree {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    Long id;
//
//    Date plantedOn;
//
//    @Enumerated(EnumType.STRING)
//    Health health;
//
//    String name;

    String getProduce();
}
