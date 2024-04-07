package org.example.class18;

public class GP {
    GP() {
        System.out.println("Grand PA");
    }
}

class P extends GP {
    P() {
        System.out.println("Parent");
    }
}

class C extends P {
    C() {
        System.out.println("Child");
    }

}

class GPTester {

    public static void main(String[] args) {
        C c = new C();

    }

}
