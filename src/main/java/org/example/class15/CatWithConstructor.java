package org.example.class15;

public class CatWithConstructor {


    private String name;  // instance variable, must be initialized, gives values to our class
    private String color;
    private int age;

    CatWithConstructor(String cName, String cColor, int cAge){

        name=cName;
        color=cColor;
        age=cAge;

    }


    void  printInfo(){
        System.out.println(name+" "+color+" "+age);
    }
}
