public class GCD {
    public static void main(String[] args) {
        int n1 = 11, n2 = 13;

        System.out.println("gcd = " + gcd(n1, n2));
    }

    public static int gcd(int n1, int n2) {
        int gcd = 0;
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
