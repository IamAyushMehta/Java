/* Write a Java program to check if a number is a palindrome in Java? ( 121 is 
a palindrome, 321 is not) 
A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is 
a palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a 
palindrome because the reverse of 321 is 123, which is not equal to 321.  */

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num : ");
        int n = sc.nextInt();

        int rev = 0, temp = n;

        while (temp > 0) {
            int rem = temp % 10;
            rev = (rev * 10) + rem;
            temp /= 10;
        }

        if (n == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}
