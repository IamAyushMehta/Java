public class RemoveDuplicates {
    public static int removeDuplicates(int arr[]) {
        int i = 0;
        int j = 1;
        int n = arr.length;
        while (j < arr.length) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
            j++;
        }
        return i + 1;
    }

    public static int[] printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(removeDuplicates(arr));
        printArray(arr);
    }
}
