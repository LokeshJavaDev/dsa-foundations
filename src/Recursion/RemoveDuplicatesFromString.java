package Recursion;

public class RemoveDuplicatesFromString {

    public static void remove(String str, StringBuilder newString, boolean[] map, int index) {
        if(index == str.length()) {
            System.out.print(newString);
            return;
        }

        char currentChar = str.charAt(index);
        if(map[currentChar - 'a'] == true) { // checking existence
            remove(str, newString, map, index + 1);
        }else{
            map[currentChar - 'a'] = true;
            newString.append(currentChar);
            remove(str,newString,map, index + 1);
        }
    }


    public static void main(String[] args) {
        String str = "programming";
        StringBuilder newString = new StringBuilder();
        boolean[] map = new boolean[26];
        int index = 0;

        remove(str,newString,map,index);

    }


}
