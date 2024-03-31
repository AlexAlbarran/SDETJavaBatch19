package org.example.class11;
/*create a String and print it in reverse order 9Sunday --> yadnuS).
 */
public class Task3 {
    public static void main(String[] args) {

        String str="Sunday";
        // .length will always give us an extra index, that is why we always input -1
        for(int i = str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }

    }
}
