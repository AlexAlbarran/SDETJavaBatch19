package org.example.class19;

public class BrowserTeater3 {
    public static void main(String[] args) {

        Browser [] arr = {new Chrome(),new FireFox(),new Safari()};

        for (int i = 0; i < arr.length; i++) {

            Browser b = arr[i];
            b.openBrowser();
            b.openBrowser();
            b.performTesting();
            b.closeBrowser();
        }
    }
}
