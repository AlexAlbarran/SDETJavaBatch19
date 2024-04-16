package mytesting;

import java.util.ArrayList;

public class ArrayListTask {
    public static void main(String[] args) {

        ArrayList <String> words = new ArrayList<>();
        words.add("Banana");
        words.add("Apple");
        words.add("Pineapple");
        words.add("Grape");
        words.add("Kiwi");
        words.add("Orange");
        words.add("Strawberry");

        words.removeIf(x->x.toLowerCase().endsWith("e"));
        System.out.println(words);
    }
}
