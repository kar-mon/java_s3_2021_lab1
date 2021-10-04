package com.company;

public class CarWash {
    void washTheCar(Car dirtyCar){
        System.out.println("wait a sec");
        System.out.println("or two");
        System.out.println(dirtyCar.model +" is dirty");
        System.out.println(dirtyCar.model +" is still dirty");
        System.out.println(dirtyCar.model +" is less dirty");
        System.out.println(dirtyCar.model +" is clean now");

        System.out.println("now you ave to pay " + dirtyCar.getCleaningPrice());
    }
}
