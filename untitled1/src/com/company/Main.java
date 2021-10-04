package com.company;

public class Main {

    public static void main(String[] args) {
        Car fiat = new PersonalCar("fiat", "punto", 1987);

        Car bmw = new PersonalCar("bmw","X5", 2015);

        Car vw = new PersonalCar("vw","aaa",2000);

        Truck scania = new Truck("scania","s200",2015);
        scania.millage = 10.1;
        scania.capacityInTones = 24.2;

        FunnyCar gokart = new FunnyCar("producent", "model", 2000);

        scania.drive(200.0);
        System.out.println(scania.millage);
        scania.drive(200.0);
        System.out.println(scania.millage);
        scania.drive(200.0);
        System.out.println(scania.millage);

        scania.loadTruck(2.0);
        scania.loadTruck(2.0);
        scania.loadTruck(2.0);
        scania.unloadTruck();

        Bus solaris = new Bus("solaris","cokolwiek", 2020);
        solaris.capacityInPeople = 40;

        scania.drive(1000.0);
        scania.drive(10.0);
        System.out.println("Truck millage is: " + scania.millage);

        vw.drive(1000.0);
        vw.drive(10.0);
        System.out.println("VW millage is: " + vw.millage);

        System.out.println(vw);
        System.out.println(scania);
        System.out.println(solaris);
        System.out.println(solaris.toString());

        CarWash superClean = new CarWash();
        superClean.washTheCar(fiat);
        superClean.washTheCar(vw);
        superClean.washTheCar(scania);
        superClean.washTheCar(solaris);
        superClean.washTheCar(gokart);

        fiat.changeWheels();
        scania.changeWheels();
        gokart.changeWheels();
        solaris.changeWheels();

    }
}
