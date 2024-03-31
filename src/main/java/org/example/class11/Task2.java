package org.example.class11;

/*
Create a String and if the String is not empty perform the following:
if the String has an odd number of characters and has 3 or more characters,
print the character in the middle of the String.
For Example String str=hello =>l
 */
public class Task2 {
    public static void main(String[] args) {

        String str="Goodbye";

        if(!str.isEmpty()){
            // isEmpty is False, because it does contain letters
            if(str.length()%2!=0 && str.length()>3){
                int middleIndex=str.length()/2;
                // here we 5 indexes, so we divide, 5/2 = 2.5, so will be the middle index
                System.out.println(str.charAt(middleIndex));
            }
        }
    }
}
