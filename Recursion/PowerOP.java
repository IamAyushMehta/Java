public class PowerOP {
    public static int powerOP(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpower = powerOP(x, n / 2);
        if (n % 2 == 0) {
            return halfpower * halfpower;
        } else {
            return x * halfpower * halfpower;
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        int res = powerOP(x, n);

        System.out.println(res);
    }
}
