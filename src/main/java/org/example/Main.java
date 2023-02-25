package org.example;

import org.example.introduction.Car;
import org.example.introduction.Config;
import org.example.introduction.Moto;
import org.example.introduction.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.Annotation;

public class Main {
    public static void main(String[] args) {

//        ClassPathXmlApplicationContext context =
//        new ClassPathXmlApplicationContext("applicationContext3.xml");
//
//        Moto moto = context.getBean("moto", Moto.class);
//        moto.go();
//        Person person = context.getBean("person", Person.class);
//        person.drive();
//        Car car = context.getBean("car", Car.class);
//        Car car1 = context.getBean("car", Car.class);
//
//        System.out.println(car == car1);
//
//        System.out.println(car);
//        System.out.println(car1);
//
//        Moto moto1 = context.getBean("moto", Moto.class);
//        Moto moto2 = context.getBean("moto", Moto.class);
//        System.out.println(moto1 == moto2);
//        System.out.println(moto1);
//        System.out.println(moto2);
//
//        context.close();

        AnnotationConfigApplicationContext context1 =
                new AnnotationConfigApplicationContext(Config.class);

        Person person = context1.getBean("person", Person.class);
        person.drive();
        context1.close();

    }
}
