package org.example.class9;

public class E3_1ArrayAverages {
    public static void main(String[] args) {

        int[] number={10,25,45,66,85,100};

        int sum=0;

        for (int i=0; i< number.length;i++) {
            sum=sum+number[i]; // this to specify the index
        }
        System.out.println(sum/number.length);
    }
}
