package org.example.class15;

public class CatTester {
    public static void main(String[] args) {

        CatWithConstructor c1 = new CatWithConstructor("Oreo","Black",2);
        c1.printInfo();

        //c1.name="Oreo";
        //c1.color="Black";
        ///c1.age=2;
        //System.out.println(c1.name);
        //System.out.println(c1.color);
        //System.out.println(c1.age);
        //System.out.println();
        CatWithConstructor c2= new CatWithConstructor("Snow","White",1);
        c2.printInfo();
        //c2.name="Snow";
        //c2.color="White";
        //c2.age=1;
        //System.out.println(c2.name);
        //System.out.println(c2.color);
        //System.out.println(c2.age);
        //System.out.println();
        CatWithConstructor c3 = new CatWithConstructor("Loca","Pink",4);
        c3.printInfo();
        //c3.name="Loca";
        //c3.color="Pink";
        //c3.age=4;
        //System.out.println(c3.name);
        //System.out.println(c3.color);
        //System.out.println(c3.age);

    }
}
