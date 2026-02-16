package String;

public class StringCaseConverter {
    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch >= 'A' && ch <= 'Z') {
                sb.append((char) (ch+32));
            }
            else if (ch >= 'a' && ch <= 'z') {
                sb.append((char) (ch-32));
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Lokesh";
        System.out.println(toggleCase(str));
    }
}
