package org.example.class25;

import java.util.ArrayList;
import java.util.List;

/*/
Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
 */
public class Task7 {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        integerList.add(10);
        integerList.add(25);
        integerList.add(75);
        integerList.add(30);
        integerList.add(44);

        int sum = 0;
        for (int num : integerList) {
            sum += num;
        }

        System.out.println(sum);
    }
}
