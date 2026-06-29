public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int target = 5;

        int index = binarySearch(arr, target);

        if (index == -1) {
            System.out.println("Number not found");
        } else {
            System.out.println("Number found at index : " + index);
        }
    }

    public static int binarySearch(int arr[], int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
