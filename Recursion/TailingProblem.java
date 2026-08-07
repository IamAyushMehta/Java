public class TailingProblem {
    public static int tailingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return tailingProblem(n - 1) + tailingProblem(n - 2);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(tailingProblem(n));
    }
}