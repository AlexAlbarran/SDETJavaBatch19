package org.example.review2;

public interface E7IfElseStatements {
    public static void main(String[] args) {

        String day = "Monday";
        if (day.equals("Monday")) {
            System.out.println("Work");
        }else if (day.equals("Tuesday")) {
            System.out.println("Work");
        }else if (day.equals("Wednesday")) {
            System.out.println("Leave");
        }else if (day.equals("Thursday")) {
            System.out.println("Work");
        }else if (day.equals("Friday")) {
            System.out.println("Movie");
        }else if (day.equals("Saturday")) {
            System.out.println("Relax");
        }else if (day.equals("Sunday")) {
            System.out.println("Relax");
        }

    }
}
