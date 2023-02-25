package org.example.introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private Tramsport car;

    @Autowired
    public Person(@Qualifier("moto") Tramsport car) {
        this.car = car;
    }


    public void setCar(Tramsport car) {

        this.car = car;
    }

    public void drive() {
        System.out.println("Владелец сел в транспорт");
        car.go();
    }
}
