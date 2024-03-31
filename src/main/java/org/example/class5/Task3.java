package org.example.class5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("In what city do you live");
        String city = scanner.nextLine();

        System.out.print("What is the temperature in fahrenheit of the city");
        double tempF = scanner.nextDouble();
        double tempC = (tempF - 32) * 5 / 9;
        System.out.println("The temperature in the city of " + city + " is " + tempC+"C");
    }


}
