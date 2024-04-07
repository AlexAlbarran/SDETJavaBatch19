package org.example.class19;

public class BrowserTester2 {
    public static void main(String[] args) {
        Chrome chrome = new Chrome();
        FireFox fireFox = new FireFox();
        Safari safari = new Safari();
        Browser [] arr = {chrome,fireFox,safari};

        for (int i = 0; i < arr.length; i++) {

            Browser b = arr[i];
            b.openBrowser();
            b.openBrowser();
            b.performTesting();
            b.closeBrowser();
        }

    }
}
