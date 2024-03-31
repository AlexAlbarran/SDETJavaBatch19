package mytesting;

import java.util.Scanner;

public class ScannerFirstLastNames {
    public static void main(String[] args) {
        java.util.Scanner scan = new Scanner(System.in);
        System.out.println("Please enter name ");
        String name = scan.next();

        System.out.println("Your name is " +name);
    }
}
