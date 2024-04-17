package org.example.class24;
/*
Create a Cat class create 3 fields a constructor and printInfo method inside it.
Create three objects from this class store them inside the Linkedlist and call printInfo method using these three objects.
 */
public class Cat {

    String name;
    String color;
    int age;

    Cat(String name, String color, int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }
    void  printInfo() {
        System.out.println(name + " " + color + " " + age);
    }
}
