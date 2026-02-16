package String;

public class ShortestPath {

    public static float getShortestPath(String path) {
        int x = 0;
        int y = 0;

        for(int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            if(dir == 'E') {
                x++;
            }
            else if(dir == 'W') {
                x--;
            }
            else if(dir == 'N') {
                y++;
            }
            else {
                y--;
            }
        }

        return (float) Math.sqrt(x*x + y*y);
    }

    public static void main(String[] args) {
        String path = "NNNEE";
        System.out.println(getShortestPath(path));
    }
}
