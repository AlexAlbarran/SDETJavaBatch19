package org.example.class11;

/*
        Write a program that reads two people's first
        names and if they expecting boy or girl?
        Based on the input suggests a name for a baby:
        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? boy
        Suggested baby name: DANRY

        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? girl
        Suggested baby name: MAIEL
     */
public class Task4 {
    public static void main(String[] args) {

        String dadName= "Alejandro";
        String momName= "Lisbeth";
        boolean isBoy=true;

        if(isBoy){
            String firstHalf=dadName.substring(0, dadName.length()/2);
            String lastHalf=momName.substring(momName.length()/2,momName.length());
            System.out.println(firstHalf+lastHalf);
        }else{
            String firstHalf= momName.substring(0, momName.length()/2);
            String lastHalf=dadName.substring(dadName.length()/2,dadName.length());
            System.out.println(firstHalf+lastHalf);
        }

    }
}
