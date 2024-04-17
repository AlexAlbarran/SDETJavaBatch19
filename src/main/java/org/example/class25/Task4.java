package org.example.class25;

import java.util.HashMap;

/*
Create a Map that will store Employee name and salary.
Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
John Smith=$100000
 */
public class Task4 {
    public static void main(String[] args) {

        HashMap<String, Integer> employeeSalaries = new HashMap<>();
        employeeSalaries.put("Alex A", 30000);
        employeeSalaries.put("Will A", 10000);
        employeeSalaries.put("John S", 40000);
        employeeSalaries.put("Nikola S", 50000);
        employeeSalaries.put("Ali H", 90000);
        employeeSalaries.put("Asghar N", 20000);
        employeeSalaries.put("Elena G", 75000);

        String name = "";

        int maxSalary = 0;

        for (var x : employeeSalaries.entrySet()) {
            if (maxSalary < x.getValue())
                maxSalary = x.getValue();
            name = x.getKey();
        }
        System.out.println(name + " $" + maxSalary);

    }
}

