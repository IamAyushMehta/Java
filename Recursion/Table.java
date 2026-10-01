public class Table {
    static void table(int n, int i) {
        System.out.print(n * i + " ");
        if (i == 10) {
            return;
        }
        table(n, i + 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        table(n, i);
    }
}
