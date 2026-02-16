package String;
/*
public class RemoveSpacesFromString {
    public static String removeSpace(String str) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch != ' '){
                sb.append(ch);
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        String str = "L ok es h 12 3";
        System.out.println(removeSpace(str));
    }
}
*/


// Optimal Approach
public class RemoveSpacesFromString {
    public static String removeSpace(String str) {
        return str.replace(" ", "");
    }

    public static void main(String[] args) {
        String str = "L ok es h 12 3";
        System.out.println(removeSpace(str));
    }
}
