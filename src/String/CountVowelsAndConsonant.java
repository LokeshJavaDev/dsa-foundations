package String;

import java.util.Set;

public class CountVowelsAndConsonant {
    public static void count(String str) {
        int vowel = 0;
        int consonant = 0;

        Set<Character> VowelSet = Set.of('a','e','i','o','u');

        str = str.toLowerCase();

        for(char ch : str.toCharArray()) {
            if(VowelSet.contains(ch)) {
                vowel++;
            }
            else if(ch >= 'a' && ch <= 'z') {
                consonant++;
            }
        }
        System.out.println("Vowel: "+vowel);
        System.out.println("Consonant: "+consonant);
    }

    public static void main(String[] args) {
        String str = "hello";
        count(str);
    }
}
