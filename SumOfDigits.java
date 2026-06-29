// Write a Java method to compute the sum of the digits in an integer.

import java.util.Scanner;

public class SumOfDigits {

    public static int sumOfDigits(int n) {

        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num : ");
        int n = sc.nextInt();

        System.out.println("sum of the digits in an integer : " + sumOfDigits(n));

        sc.close();
    }
}
