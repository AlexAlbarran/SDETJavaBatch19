package org.example.class5;

import java.util.Scanner;

public class E2Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a byte number");
        byte smallbox = scanner.nextByte();
        System.out.println("Please enter a double number");
        double bigBox = scanner.nextDouble();
        System.out.println("Please enter a boolean number");
        boolean logicalBox = scanner.nextBoolean();

        System.out.println(smallbox);
        System.out.println(bigBox);
        System.out.println(logicalBox);

    }
}
