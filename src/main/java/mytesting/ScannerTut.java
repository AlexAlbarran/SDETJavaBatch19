package mytesting;

import java.util.Scanner;

public class ScannerTut {
    public static void main(String[] args) {

        Scanner oreo = new Scanner(System.in);

        System.out.println("What's your first name?");
        // Here we are asking for a String, the name.
        String name = oreo.next();

        System.out.println("What's your age?");
        // Here we are asking for an integer, whole number.
        int age = oreo.nextInt();

        System.out.println("What's your senior quote?");
        String quote = oreo.next();
        quote = quote + oreo.nextLine();
// you can also write quote += oreo.nextLine()

        System.out.println("Thank you "+name+", you are "+age+" years old");
        System.out.println("and your senior quote is "+quote);

    }
}
