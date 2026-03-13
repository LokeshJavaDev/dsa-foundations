package Recursion;

public class StringLengthUsingRecursion {
    public static int findLength(String str, int idx) {
        if(idx ==  str.length()) {
            return 0;
        }
        return 1 + findLength(str, idx + 1);
    }

    public static void main(String[] args) {
        String str = "Lokesh";
        System.out.println(findLength(str,0));
    }
}
