package org.example.class10;

public class Car2Tester {
    public static void main(String[] args) {

        Car2 vehicle1 = new Car2();
        vehicle1.make="Ford";
        vehicle1.model="Focus";
        vehicle1.color="Blue";
        vehicle1.bodyType="Sedan";
        vehicle1.year=2024;
        vehicle1.cost=21000;
        System.out.println(vehicle1.make);
        System.out.println(vehicle1.model);
        System.out.println(vehicle1.color);
        System.out.println(vehicle1.bodyType);
        System.out.println(vehicle1.year);
        System.out.println(vehicle1.cost);

        vehicle1.runsSlow();
        vehicle1.stops();

        System.out.println();

        Car2 vehicle2 = new Car2();
        vehicle2.make="Ford";
        vehicle2.model="Explorer";
        vehicle2.color="Blue";
        vehicle2.bodyType="SUV";
        vehicle2.year=2022;
        vehicle2.cost=32000;
        System.out.println(vehicle2.make);
        System.out.println(vehicle2.model);
        System.out.println(vehicle2.color);
        System.out.println(vehicle2.bodyType);
        System.out.println(vehicle2.year);
        System.out.println(vehicle2.cost);

        vehicle2.runsFast();
        vehicle2.stops();
        vehicle2.radio();

        System.out.println();

        Car2 vehicle3 = new Car2();
        vehicle3.make="Ford";
        vehicle3.model="Mustang";
        vehicle3.color="Silver";
        vehicle3.bodyType="Sportscar";
        vehicle3.year=2024;
        vehicle3.cost=52000;
        System.out.println(vehicle3.make);
        System.out.println(vehicle3.model);
        System.out.println(vehicle3.color);
        System.out.println(vehicle3.bodyType);
        System.out.println(vehicle3.year);
        System.out.println(vehicle3.cost);

        vehicle3.runsFast();
        vehicle3.stops();
        vehicle3.radio();













    }
}
