package org.example.class5;

public class E8LogicalOR {
    public static void main(String[] args) {

       boolean flowers=false;
       boolean chocolates=false;
       boolean giveCreditCard=true;
       boolean allMyMistake=false;

       if(flowers || chocolates || giveCreditCard || allMyMistake){
           System.out.println("Wife is Happy");
       }else{
           System.out.println("Wife is Sad");
       }
    }
}
