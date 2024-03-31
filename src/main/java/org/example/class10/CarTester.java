package org.example.class10;

public class CarTester {
    public static void main(String[] args) {

        Car toyotaCar=new Car();
        toyotaCar.make="Toyota";
        toyotaCar.model="Prius";
        toyotaCar.year=2024;
        toyotaCar.color="Red";
        toyotaCar.price=50000;
        System.out.println(toyotaCar.make);
        System.out.println(toyotaCar.model);
        System.out.println(toyotaCar.year);
        System.out.println(toyotaCar.price);
        toyotaCar.moveForward();
        toyotaCar.applyBrakes();


        Car toyotaCar2=new Car();
        toyotaCar2.make="Ford";
        toyotaCar2.model="F150";
        toyotaCar2.year=2024;
        toyotaCar2.color="Silver";
        toyotaCar2.price=80000;
        System.out.println(toyotaCar2.make);
        System.out.println(toyotaCar2.model);
        System.out.println(toyotaCar2.year);
        System.out.println(toyotaCar2.price);
        toyotaCar2.moveForward();
        toyotaCar2.applyBrakes();





    }
}
