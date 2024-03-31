package org.example.class7;

// from an Array of integer elements find the largest number
public class Task7FindingTheBLargestNum {
    public static void main(String[] args) {

        int[] numbers={25,210,30,45,50};
        int maxNum = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] > maxNum){
                maxNum = numbers[i];
            }
        }
        System.out.println(maxNum);
    }
}
