public class MergeSortedArray {
    public static void mergeSortedArray(int arr1[], int arr2[]) {
        int i = 0;
        int j = 0;
        int temp[] = new int[arr1.length + arr2.length];
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                temp[k] = arr1[i];
                i++;
            } else {
                temp[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            temp[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            temp[k] = arr2[j];
            j++;
            k++;
        }

        for (int x : temp) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7, 9 };
        int[] arr2 = { 2, 4, 8, 10, 11, 12, 16 };
        mergeSortedArray(arr1, arr2);
    }
}
