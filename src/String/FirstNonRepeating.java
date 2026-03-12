package String;

public class FirstNonRepeating {
    public static char firstNonRepeating(String str) {
        int[] freq = new int[26];

        for (char ch : str.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (char ch : str.toCharArray()) {
            if (freq[ch - 'a'] == 1) {
                return ch;
            }


        }
        return '_';
    }

    public static void main(String[] args) {
        String str = "aabccdde";
        System.out.println(firstNonRepeating(str));
    }
}
