public class BinarySearch {
    public static int binarySearch(int arr[], int start, int end, int tar) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (tar == arr[mid]) {
            return mid;
        }
        if (tar > arr[mid]) {
            return binarySearch(arr, mid + 1, end, tar);
        } else {
            return binarySearch(arr, start, mid - 1, tar);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(binarySearch(arr, 0, arr.length, 5));
    }
}
