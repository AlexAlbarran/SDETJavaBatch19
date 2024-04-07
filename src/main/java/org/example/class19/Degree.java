package org.example.class19;
/*
Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
Call the method by creating an object of each of the three classes.
 */
public class Degree {

    public void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }
}

class Bachelors extends Degree {

}

class Masters extends Degree {
    @Override
    public void getPrerequisite() {
        System.out.println("To get a Master's degree you need a Bachelor's degree");
    }
}

class DegreeTester {
    public static void main(String[] args) {
        Degree d = new Degree();
        Bachelors b = new Bachelors();
        Masters m = new Masters();
        d.getPrerequisite();
        b.getPrerequisite();
        m.getPrerequisite();
    }
}
