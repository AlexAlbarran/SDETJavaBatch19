package org.example.class25;

import java.util.HashMap;
import java.util.Map;

/*
Create a map of a building. Store floor number and its associated company name.
(Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
 */
public class Task1 {
    public static void main(String[] args) {

        HashMap<Integer, String> buildingMap = new HashMap<>();
        buildingMap.put(1, "Google");
        buildingMap.put(2, "Syntax");
        buildingMap.put(3, "Microsoft");
        buildingMap.put(4, "Google");
        buildingMap.put(5, "Amazon");
        buildingMap.put(6, "Apple");
        buildingMap.put(7, "Microsoft");

        System.out.println(buildingMap.size());
        buildingMap.put(4, "Facebook");
        buildingMap.remove(7);

        System.out.println("Building Map:");
        for (Map.Entry<Integer, String> entry : buildingMap.entrySet()) {
            System.out.println("Floor " + entry.getKey() + ": " + entry.getValue());
        }

    }
}
