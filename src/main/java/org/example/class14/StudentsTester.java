package org.example.class14;

public class StudentsTester {
    public static void main(String[] args) {

        Students st1 = new Students();
        st1.Name = "Alex";
        st1.ID = 001;
        st1.numberOfStudents ++;

        System.out.println(st1.Name);
        System.out.println(st1.ID);
        System.out.println(Students.numberOfStudents);

        Students st2 = new Students();
        st2.Name = "Bern";
        st2.ID = 002;
        st2.numberOfStudents ++;

        System.out.println(st2.Name);
        System.out.println(st2.ID);
        System.out.println(Students.numberOfStudents);

    }
}
