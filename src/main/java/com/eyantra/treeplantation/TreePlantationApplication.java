package com.eyantra.treeplantation;

import com.eyantra.treeplantation.model.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TreePlantationApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//		Tree tree = (Tree) context.getBean("flowerTree");
//		System.out.println(tree.getProduce());
//		System.out.println(((FlowerTree)tree).getName());

		Engine engine = (Engine) context.getBean("marutiEngine");
		System.out.println(engine);

		Transmission transmission = (Transmission) context.getBean("marutiTransmission");
		System.out.println(transmission);

		Engine engine2 = (Engine) context.getBean("hondaEngine");
		System.out.println(engine2);

		Transmission transmission2 = (Transmission) context.getBean("hondaTransmission");
		System.out.println(transmission2);

		Car car = (Car) context.getBean("car");
		System.out.println(car);
	}
}
