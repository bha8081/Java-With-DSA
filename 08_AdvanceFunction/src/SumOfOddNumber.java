// Write a function to print the sum of the all odd numbers from 1 to n.

import java.util.Scanner;

public class SumOfOddNumber {
    public static void printSum(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            if(i % 2 != 0) {
                sum = sum + i;
            }
        }

        System.out.println(sum);
    }

//    main class file.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        printSum(n);
    }
}
