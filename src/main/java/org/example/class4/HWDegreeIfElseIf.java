package org.example.class4;

public class HWDegreeIfElseIf {
    public static void main(String[] args) {

        boolean degree = true;
        double gpa=3.9;

        if (degree) {

            if (degree) {
                System.out.println("Congradulations");
            }
            if (gpa>3.5) {
                System.out.println("You are eligible for a scholarship");
            } else {
                System.out.println("You should have studied harder");
            }
        } else {
            System.out.println("You should get a degree");
        }

    }
}
