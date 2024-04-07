package org.example.class20;

public class FileTester {
    public static void main(String[] args) {
        File[] files = {new JavaFile("Animal.java", 34), new PdfFile("Divorce_Paper.pdf", 140),
                new WordFile("How To " + "Understand Women.doc", 1000000000)};

        for (File f : files) {
                f.open();
                f.edit();
                f.close();
            }
        }
    }
