package mytesting;

import java.io.InputStream;

public class Scanner {
    public Scanner(InputStream in) {
    }

    public static void main(String[] args) {

        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Enter a grade:");

        int n = scan.nextInt();
        System.out.println(n);

        if(n >= 90 && n <= 100) {
            System.out.println("A");
        }
        else if(n >= 80 && n <= 89){
            System.out.println("B");
        }
        else if(n >= 70 && n <= 79){
            System.out.println("C");
        }
        else if(n >= 65 && n <= 69){
            System.out.println("D");
        }
        else if(n >= 0 && n <= 64){
            System.out.println("F");
        }
        else {
            System.out.println("The number you entered is not in the range.");
        }
    }
}
