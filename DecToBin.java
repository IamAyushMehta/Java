import java.util.*;

public class DecToBin {
    public static void decToBin(int n) {
        int binNum = 0, pow = 0, myNum = n;
        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            n /= 2;
        }
        System.out.println("Binary of " + myNum + " is = " + binNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num : ");
        int num = sc.nextInt();

        decToBin(num);
        sc.close();
    }
}