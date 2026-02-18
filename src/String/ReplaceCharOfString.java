package String;
/*
public class ReplaceCharOfString {
    public static String replaceBrute(String str, char oldChar, char newChar) {
        String res = "";
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == oldChar) {
                res = res + newChar;
            }else{
                res = res + str.charAt(i);
            }
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(replaceBrute("apple", 'p', 'b'));
    }
}
 */


/*
public class ReplaceCharOfString {
    public static String replaceOptimal(String str, char oldChar, char newChar) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == oldChar) {
                sb.append(newChar);
            }else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceOptimal("apple", 'p', 'b'));
    }
}

*/

public class ReplaceCharOfString {
    public static void main(String[] args) {
        String str = "Apple";
        String res = str.replace("p", "b");
        System.out.println(res);

    }
}