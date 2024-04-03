package org.example.class16;

public class Students {

    private String studentName;
    private int grade1;
    private int grade2;
    private int grade3;

    public Students(String name, int sub1, int sub2, int sub3) {
        studentName = name;
        grade1 = sub1;
        grade2 = sub2;
        grade3 = sub3;
    }

    public double avgGrade() {

        int sum = grade1 + grade2 + grade3;
        return (double) sum / 3;
    }

    public String getStudentName() {
        return studentName;
    }



}
