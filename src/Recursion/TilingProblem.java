package Recursion;

public class TilingProblem {
    public static int tilingWay(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        // Vertical
        int vertical = tilingWay(n - 1);

        //Horizontal
        int horizontal = tilingWay(n - 2);

        // Total ways
        return vertical + horizontal;
    }

    public static void main(String[] args) {
        int n = 4;
        int res = tilingWay(n);
        System.out.println("Total Ways: "+res);
    }
}
