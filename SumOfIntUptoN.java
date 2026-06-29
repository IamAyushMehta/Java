// Write a Java method to compute the sum of the digits in an integer.

import java.util.Scanner;

public class SumOfIntUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num : ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum : " + sum);

        sc.close();
    }
}
