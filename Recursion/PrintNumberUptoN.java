public class PrintNumberUptoN {
    public static void printNumberUptoN(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printNumberUptoN(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        printNumberUptoN(n);
    }
}