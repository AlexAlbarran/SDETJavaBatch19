package org.example.class26;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\IronMan\\IdeaProjects\\SDETJavaBatch19\\Files\\Config.properties";

        FileInputStream fis = new FileInputStream(path);

        Properties properties = new Properties();

        properties.load(fis);
        System.out.println(properties.get("url"));
        System.out.println(properties.get("username"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("browser"));

    }
}
