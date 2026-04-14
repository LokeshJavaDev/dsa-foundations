package BasicJavaLearning;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // For Number
        System.out.println("Enter a Number:- ");
        int number = scanner.nextInt();
        System.out.println("You Entered:- "+number);

        // For String
        System.out.println("Enter a String:- ");
        String str = scanner.next();
        System.out.println("You Entered:- "+str);

        // Clear the buffer
        scanner.nextLine();
        // For Line
        System.out.println("Enter any sentence: -");
        String line = scanner.nextLine();
        System.out.println("You Entered:- "+line);

        // Input the element of an array and then Print the elements of an array
        System.out.println("Enter the size of the array:- ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Taking input
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Print Array
        for(int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

    }

}
