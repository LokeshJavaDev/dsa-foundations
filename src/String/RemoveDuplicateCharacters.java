package String;

import java.util.HashSet;

public class RemoveDuplicateCharacters {
    public static String remove(String str){
        StringBuilder sb = new StringBuilder();

        HashSet<Character> set = new HashSet<>();

        for(char ch : str.toCharArray()) {
            if(!set.contains(ch)) {
                set.add(ch);
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(remove("programming"));
    }
}
