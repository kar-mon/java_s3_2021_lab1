package com.company;

public class PersonalCar extends Car{

    Boolean autonomous = false;

    public PersonalCar(String producer, String model, Integer yearOfproduction) {
        super(producer, model, yearOfproduction);
    }

    @Override
    public Double getCleaningPrice() {
        return 30.0;
    }

    @Override
    public void changeWheels() {
        System.out.println("4 wheels changed");
    }
}
