package org.example.class19;

public class Parent {

    void marry() {
        System.out.println("Marry the girl we choose for you");
    }
}

class Alex extends Parent {

    void marry() {
        System.out.println("I want to marry Talor Swift");
    }
}

class ParentTester {
    public static void main(String[] args) {
        Alex c = new Alex();
        c.marry();
    }

}
