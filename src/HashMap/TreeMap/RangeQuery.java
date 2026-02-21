package HashMap.TreeMap;

import java.util.TreeMap;

public class RangeQuery {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(10, "A");
        map.put(20, "B");
        map.put(30, "C");
        map.put(40, "D");
        map.put(50, "E");
        map.put(60, "F");
        System.out.println("Range from 20 to 50");
        System.out.println(map.subMap(20,true,50,true));
    }
}
