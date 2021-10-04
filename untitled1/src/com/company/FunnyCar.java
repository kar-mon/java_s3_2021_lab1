package com.company;

public class FunnyCar extends Car{
    public FunnyCar(String producer, String model, Integer yearOfproduction) {
        super(producer, model, yearOfproduction);
    }

    @Override
    public Double getCleaningPrice() {
        return 27.7;
    }

    @Override
    public void changeWheels() {
        System.out.println("some wheels changed");
    }
}
