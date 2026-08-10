public class PrimeUptoN {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {

        int num = 20;
        System.out.print("Prime : ");
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
