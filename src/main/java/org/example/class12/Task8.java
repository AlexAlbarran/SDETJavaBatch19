package org.example.class12;

public class Task8 {

    void isPalindrome(String originalStr) {
        StringBuilder st=new StringBuilder(originalStr);
        st.reverse();
        String reverseStr=st.toString();
        if(originalStr.equals(reverseStr)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
