package HashMap.TreeMap;

import java.util.TreeMap;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3, 2, 4, 1};

        TreeMap<Integer,Integer> freq = new TreeMap<>();

        for(int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequency (Sorted by key):");
        System.out.println(freq);
    }
}
