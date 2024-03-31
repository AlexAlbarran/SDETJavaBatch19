package org.example.review6;

public class E1Methods {

    void printNumbers (int num){

        for (int i = 0; i < num; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        E1Methods e = new E1Methods();
        e.printNumbers(5);
    }
}
