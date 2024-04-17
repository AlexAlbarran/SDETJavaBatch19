package org.example.class25;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*Create a map of Best Buy store.
Place item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
 */
public class Task3 {
    public static void main(String[] args) {

        Map<Integer,String> bestBuy=new TreeMap<>();
        bestBuy.put(766001,"Printer");
        bestBuy.put(766006,"Monitor");
        bestBuy.put(766007,"Camera");
        bestBuy.put(766003,"Microphone");
        bestBuy.put(766002,"TV");

        bestBuy.entrySet().forEach(x-> System.out.println(x.getKey()+" "+x.getValue()));

        System.out.println("***********");

        Set<Map.Entry<Integer,String>> entrySet = bestBuy.entrySet();
        System.out.println(entrySet);




    }
}
