package Stack;

import java.util.*;

public class NextGreaterElement {

    public static void main(String[] args) {

        int arr[] = {6, 8, 0, 1, 3};

        int[] result = findNextGreater(arr);

        printArray(result);
    }
    public static int[] findNextGreater(int[] arr) {

        int n = arr.length;
        int[] nxtGreater = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            // Step 1: Pop smaller elements
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }

            // Step 2: Assign result
            if (stack.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[stack.peek()];
            }

            // Step 3: Push index
            stack.push(i);
        }

        return nxtGreater;
    }

    //  Utility Method to Print
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
