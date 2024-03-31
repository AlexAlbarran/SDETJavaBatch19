package org.example.class11;

public class E14StringSplitSentences {
    public static void main(String[] args) {

        String str=" Matt you still have time Run away. Listen to me only. Every one else is lying";
        String [] sentences=str.split("[.]");
        System.out.println(sentences.length);
        System.out.println(sentences[2].trim());

        }
    }
