package HashMap;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {

    // Function 1 : Count freq. of char
    public static HashMap<Character, Integer> countFrequency(String str) {
        HashMap<Character, Integer>  map = new HashMap<>();

        for(char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch ,0) + 1);
        }
        return map;
    }

    // Function 2: Find first non-repeating character

    public static char findFirstNonRepeating(String str) {
        HashMap<Character, Integer> map = countFrequency(str);

        for(char ch : str.toCharArray()) {
            if(map.get(ch) == 1) {
                return ch;
            }
        }
        return '_';
    }

    public static void main(String[] args) {
        String str = "aabbcde";
        char res = findFirstNonRepeating(str);
        System.out.println("First Non-Repeating Character: "+res);

    }
}
