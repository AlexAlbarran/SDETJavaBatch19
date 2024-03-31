package org.example.class8;

public class E1Break {
    public static void main(String[] args) {
        String [] names = {"James","Iram","Matt Naughty","ubaidur","Aladin","Ana","Silvia"};
        // search for the name ubaidur if it is present print on the console name is present

        String name = "ubaidur";

        for (String n:names){
            if (n.equals(name))
                System.out.println(n+" is present");
            break;
        }
    }
}
