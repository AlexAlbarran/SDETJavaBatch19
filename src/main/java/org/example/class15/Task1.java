package org.example.class15;
/*
Create a method that will accept an array as parameters and will return a sum of all elements from that array.
Method should be visibly only within same package and accessible by the creating an instance/object of the class.
 */
public class Task1 {
        int sum(int[] arr) {
            int sumArray = 0;

            //for (int num : arr)
            for (int i = 0; i < arr.length; i++) {

                //sumArray += num;
                sumArray=sumArray+arr[i];
            }
            return sumArray;
        }
    }

