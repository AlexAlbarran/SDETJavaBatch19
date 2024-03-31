package org.example.class7;

public class Task6FindingSumofInt {
    public static void main(String[] args) {

        // create an Array of integers and calculate the sum of all elements in an array
        int[] numbers={10,20,30,40,50};
        int sum=0;
        for(int num:numbers){
            sum=sum+num;
        }
        System.out.println(sum);
    }
}
