package org.example.class12;

public class Task4 {
    public static void main(String[] args) {

        String str="This is sentence i want to reverse";
        String[] strArray=str.split(" ");
        for (String s:strArray){
            StringBuilder st=new StringBuilder(s);
            st.reverse();
            System.out.print(st+" ");
        }
    }
}
