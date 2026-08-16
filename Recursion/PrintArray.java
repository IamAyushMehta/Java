public class PrintArray {
    public static void printArray(int arr[]) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        printArray(arr);
    }
}
