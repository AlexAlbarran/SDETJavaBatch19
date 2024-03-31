package org.example.class9;

public class E5ArrayEnhanceLoop {
    public static void main(String[] args) {

        int[] numbers = {10, 25, 45, 66, 85, 100};

        double sum = 0;
        for (int n : numbers) { // this is the enhanced loop
            sum += n;
            // sum = sum + n is the same as above
        }

        sum = sum / numbers.length;

        System.out.println(sum);
        }
    }
