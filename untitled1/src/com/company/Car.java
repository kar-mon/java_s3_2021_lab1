package com.company;

public abstract class Car implements Drivable {
    final String producer;
    final String model;
    final Integer yearOfproduction;
    Double millage;

    public Car(String producer, String model, Integer yearOfproduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfproduction = yearOfproduction;
        this.millage = 10.0;
    }

    public void drive(Double distance){
        this.millage += distance;
    }

    public boolean hasDriver(){
        //here should be some logic
        return true;
    }

    public Double getVelocity(){
        //here should be some logic
        return 0.0;
    }

    public String toString(){
        return "Producer: " + this.producer + "model: " +this.model;
    }

    abstract public Double getCleaningPrice();
    abstract public void changeWheels();
}
