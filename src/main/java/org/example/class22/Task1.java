package org.example.class22;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        StringBuilder sb = new StringBuilder(a);
        String reversed = sb.reverse().toString().toLowerCase();
        if(reversed.equals(a.toLowerCase())){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}
