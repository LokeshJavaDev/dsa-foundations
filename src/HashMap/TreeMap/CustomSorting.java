package HashMap.TreeMap;

import java.util.TreeMap;

public class CustomSorting {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>(
                (a, b) -> {
                    if(a.length() == b.length()) {
                        return a.compareTo(b);
                    }
                    return a.length() - b.length();
                }
        );
        map.put("Apple", 1);
        map.put("Kiwi", 2);
        map.put("Banana", 3);
        map.put("Mango", 4);

        System.out.println(map);
    }
}
