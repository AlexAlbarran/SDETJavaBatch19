package org.example.class21;

public class VehicleTester {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(20000, 25); // Price: $20,000, Length: 25 feet
        Truck truck = new Truck(30000, 2500); // Price: $30,000, Weight: 2500 kg

        // Calculating and printing sale price for Sedan and Truck
        System.out.println("Sale price of Sedan: $" + sedan.calculateSalePrice());
        System.out.println("Sale price of Truck: $" + truck.calculateSalePrice());

    }
}
