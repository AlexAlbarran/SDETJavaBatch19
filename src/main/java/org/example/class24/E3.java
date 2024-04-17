package org.example.class24;

import java.util.ArrayList;

public class E3 {
    public static void main(String[] args) {

       long startTime=System.currentTimeMillis();
        ArrayList<String> names=new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            names.add(0,"Nikola");
        }
        long endTime=System.currentTimeMillis();

        System.out.println(endTime-startTime);

    }
}
