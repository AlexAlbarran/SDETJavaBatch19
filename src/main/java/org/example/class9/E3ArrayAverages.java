package org.example.class9;

public class E3ArrayAverages {
    public static void main(String[] args) {

        int [] numbers = {10,25,45,66,85,100};

        int sum = 0;
        int count = numbers.length;

        for(int num:numbers){  // this to specify the index
            sum += num;
        }
        int average = sum / count;

        System.out.println(average);
    }
}
