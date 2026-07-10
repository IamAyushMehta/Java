public class CheckOddOrEven {
    public static void main(String[] args) {
        int n = 5;

        checkOddOrEven(n);
    }

    public static void checkOddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
