package HashMap.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache <K,V> extends LinkedHashMap<K,V> {

    private final int capacity;


    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public void displayCache() {
        System.out.println("Current Cache: " + this);
    }

        public static void main(String[] args) {

            // Browser tabs example: capacity = 3
            LRUCache<String, String> browserCache = new LRUCache<>(3);

            browserCache.put("Google", "Tab1");
            browserCache.put("YouTube", "Tab2");
            browserCache.put("GitHub", "Tab3");

            System.out.println("Opened 3 tabs:");
            browserCache.displayCache();

            // Accessing Google again → moves to most recently used
            browserCache.get("Google");
            System.out.println("\nVisited Google tab:");
            browserCache.displayCache();

            // Open LinkedIn → triggers eviction of least recently used
            browserCache.put("LinkedIn", "Tab4");
            System.out.println("\nOpened LinkedIn tab:");
            browserCache.displayCache();

            // Open Facebook → triggers eviction
            browserCache.put("Facebook", "Tab5");
            System.out.println("\nOpened Facebook tab:");
            browserCache.displayCache();
        }

}
