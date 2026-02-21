package HashMap;

import java.util.HashMap;

public class HashMapBasics {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        // Insert
        map.put("Physics",84);
        map.put("Maths",54);
        map.put("Chemistry",84);

        // Get
        System.out.println(map.get("Physics"));

        // check
        System.out.println(map.containsKey("Maths"));

        // Remove
        map.remove("Maths");
        // Print
        System.out.println(map);
    }
}
