public class countDigit {
    public static void main(String[] args) {
        int n = 14;
        System.out.println("Digits : " + countDigits(n));
    }

    public static int countDigits(int n) {
        int count = 0;
        if (n > 0) {
            while (n > 0) {
                count++;
                n /= 10;
            }
            return count;
        } else {
            return count;
        }
    }
}
