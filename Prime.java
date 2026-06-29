import java.util.*;

public class Prime {
    public static boolean isPrime(int n) {
        boolean isPrime = true;

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num : ");
        int n = sc.nextInt();

        boolean Prime = isPrime(n);
        if (Prime == true) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

        sc.close();
    }
}