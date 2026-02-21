package HashMap.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        /* This Maintains Order
        LinkedHashMap is a combination of -- HashMap + Doubly linked list
        HashMap for Fast lookup and DLL to maintain Order
         */

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("Orange",10);
        linkedHashMap.put("Apple",20);
        linkedHashMap.put("Guava",90);

        for(Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() +": " + entry.getValue());
        }

    }
}
