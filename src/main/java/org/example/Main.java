package org.example;

import org.example.introduction.Car;
import org.example.introduction.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
//        Car car = context.getBean("customCar", Car.class);
//        car.go();

//        Person person = context.getBean("customPerson", Person.class);
//        person.drive();
        Car car = context.getBean("customCar", Car.class);
        Car car1 = context.getBean("customCar", Car.class);
        System.out.println(car1 == car);
        System.out.println(car);
        System.out.println(car1);
        context.close();
        ClassPathXmlApplicationContext context1 =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Car car2 = context1.getBean("customCar", Car.class);
        Car car3 = context1.getBean("customCar", Car.class);
        System.out.println(car3 == car2);
        System.out.println(car3);
        System.out.println(car2);
        context1.close();

    }
}
