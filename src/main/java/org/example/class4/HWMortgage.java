package org.example.class4;

public class HWMortgage {
    public static void main(String[] args) {
        double rate = 2.5;
        double price = 110000;

        if (rate >= 4.5) {
            System.out.println("User will not buy a house");
        } else if (rate <= 4.5) {
            System.out.println("User will consider buying");
        }
        if (price >= 100000) {
            System.out.println("User will take a loan");
        } else {
            System.out.println("User will pay cash");
        }
    }
}
