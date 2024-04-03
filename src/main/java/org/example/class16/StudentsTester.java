package org.example.class16;

public class StudentsTester {
    public static void main(String[] args) {

        // Creating two instances of Student with different marks
        Students student1 = new Students("Alex", 85, 92, 88);
        Students student2 = new Students("Lis", 95, 81, 93);

        // Printing average marks for each student
        System.out.println("Average mark for " + student1.getStudentName() + ": " + student1.avgGrade());
        System.out.println("Average mark for " + student2.getStudentName() + ": " + student2.avgGrade());
    }

    }

