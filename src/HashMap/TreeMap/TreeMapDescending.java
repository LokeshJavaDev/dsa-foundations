package HashMap.TreeMap;
import java.util.*;

public class TreeMapDescending {
    public static void main(String[] args) {

        TreeMap<Integer, Integer> products =
                new TreeMap<>(Collections.reverseOrder());

        products.put(10, 500);
        products.put(5, 200);
        products.put(20, 800);
        products.put(15, 300);

        System.out.println("Sorted (Descending):");
        System.out.println(products);
    }
}