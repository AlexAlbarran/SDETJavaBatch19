package org.example.class12;

    /*
    You have a String a="Is it Saturday? Is it raining? Do we have a Java Class today?"
    How would you find out how many sentences are in that String
     */
public class Task3 {
    public static void main(String[] args) {

        String str="Is it Saturday? Is it raining? Do we have a Java Class today?";
        System.out.println(str.split("[?]").length);
    }
}
