import java.util.*;

public class Prime {
    public static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num : ");
        int n = sc.nextInt();

        boolean Prime = isPrime(n);
        if (Prime) {
            System.out.print("Prime");
        } else {
            System.out.print("Not Prime");
        }

        sc.close();
    }
}