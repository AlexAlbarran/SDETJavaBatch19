package mytesting;

public class IfStatements {
    public static void main(String[] args) {
        // if statement = performs a block of code if it's condition evaluates to be true

        int age = 15;

        if(age>=75) {
            System.out.println("Ok Boomer!");
        }
        else if(age>=18) {
            System.out.println("You are an adult!");
        }
        else if(age>=13) {
            System.out.println("You are a Teenager!");
        }
        else {
            System.out.println("You are NOT an adult.");
        }
    }
}