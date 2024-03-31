package org.example.review3;

public class E7LogicalNot {
    public static void main(String[] args) {

        int age = 10;
        // can also be written if (!(age==10 || age==20 || age==30))
        if (age!=10 && age!=20 && age!=30){
            System.out.println("You will get a discount of 20%");
        }
    }
}
