package mytesting;

import java.util.Scanner;

public class TaskBreak1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please print a number between 1 and 20");
        int num = scan.nextInt();

        while(true){
            if(num<1 || num>10)
                continue;

            break;
        }
        System.out.println(num+" is between 1and 10.");

    }
}
