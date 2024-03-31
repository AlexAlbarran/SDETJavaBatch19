package org.example.class5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the amount of loan");
        int loan = scanner.nextInt();
        if (loan <= 200000) {
            System.out.println("Loan is rejected");
        } else {
            System.out.println("Loan is approved");
        }

    }
}
