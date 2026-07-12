public class ArmstrongNum {
    public static void main(String[] args) {
        int n = 153;

        System.out.println(isArmstrong(n));
    }

    public static boolean isArmstrong(int n) {
        int count = 0, temp = n, rev = 0, sum = 0;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        temp = n;

        while (temp > 0) {
            int rem = temp % 10;
            rev = (rev * 10) + rem;
            sum += Math.pow(rem, count);
            temp /= 10;
        }

        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }
}
