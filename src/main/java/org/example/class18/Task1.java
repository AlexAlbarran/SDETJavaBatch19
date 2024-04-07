package org.example.class18;
/*
Create a method to find the minimum of two numbers.
Method will be passed two parameters and will return the minimum number.
Method should work with int and double data types.
Examples
min(10,5)=>5
min(2.5,3.5)=>2.5

Use separate class to test your code
 */
class Task1 {
    public int minNum(int a, int b) {
        return a > b ? b : a;
    }

    public double minNum(double a, double b) {
        return Math.min(a, b);
    }
}
        class Task1Tester{
            public static void main(String[] args) {
                Task1 num = new Task1();
                System.out.println(num.minNum(15,25));
    }
}