import java.util.Scanner;

public class PrintNumber {

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        printInc(n - 1);
        System.out.print(" " + n);
    }

    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number : ");
        int n = sc.nextInt();

        printInc(n);
        sc.close();
    }
}
