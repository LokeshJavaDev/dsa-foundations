package HashMap.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapAscending {
    public static void main(String[] args) {
        // This Tree uses by default Ascending order Sorting
        TreeMap<Integer, String> students = new TreeMap<>();
        students.put(103, "Rahul");
        students.put(101, "Amit");
        students.put(105, "Neha");
        students.put(102, "Priya");

        System.out.println("Sorted Ascending :");

        for(Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
