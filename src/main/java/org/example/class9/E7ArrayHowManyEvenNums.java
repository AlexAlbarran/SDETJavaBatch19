package org.example.class9;

public class E7ArrayHowManyEvenNums {
    public static void main(String[] args) {
        // calculate the avg of numbers which are greater than 25
        // Count how many even numbers are present in this array
        int[] numbers = {10, 25, 45, 66, 85, 100,26,89,56,33};
        int counter = 0;

        for(int n:numbers){
            if(n %2 ==0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
