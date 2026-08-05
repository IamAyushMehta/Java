public class PrintArray {
    public static int[] printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static int[][] printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        printArray(arr);
    }
}
