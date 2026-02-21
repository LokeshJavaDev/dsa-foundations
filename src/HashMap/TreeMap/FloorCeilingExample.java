package HashMap.TreeMap;

import java.util.TreeMap;

public class FloorCeilingExample {

    public static void main(String[] args) {
        TreeMap< Integer, String> map = new TreeMap<>();

        map.put(10, "A");
        map.put(20, "B");
        map.put(30, "C");
        map.put(40, "D");

        System.out.println("Floor of 25 : "+map.floorKey(25));
        System.out.println("Ceiling of 25: " + map.ceilingKey(25));
    }
}
