/* Search about(Google) & use the following methods of the Math class in Java: 
a. Math.min( ) 
b. Math.max( ) 
c. Math.sqrt( ) 
d. Math.pow( ) 
e. Math.avg( ) 
f. Math.abs( )  */

import java.util.*;

public class MathFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first num : ");
        int a = sc.nextInt();
        System.out.print("Enter second num : ");
        int b = sc.nextInt();

        // System.out.println("Minimum num in " + a + " and " + b + " : " + Math.min(a,
        // b));
        // System.out.println("Maximum num in " + a + " and " + b + " : " + Math.max(a,
        // b));
        // System.out.println("Square root of " + a + " : " + Math.sqrt(a));
        // System.out.println("Square root of " + b + " : " + Math.sqrt(b));
        // System.out.println(a + " to the power " + b + " : " + Math.pow(a, b));
        System.out.println("Absolute value of " + a + " : " + Math.abs(a));
        System.out.println("Absolute value of " + b + " : " + Math.abs(b));

        sc.close();
    }
}
