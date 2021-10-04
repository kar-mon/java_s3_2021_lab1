package com.company;

public class Bus extends Car{
    Integer capacityInPeople;

    public Bus(String producer, String model, Integer yearofProduction) {
        super(producer, model, yearofProduction); //common features
        this.capacityInPeople = 40;
    }

    public String toString(){
        return "I'm bus and I can have " + capacityInPeople + " people inside";
    }

    @Override
    public Double getCleaningPrice() {
        return 300.0;
    }

    @Override
    public void changeWheels() {
        System.out.println("6 wheels changed");
    }
}
