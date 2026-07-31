public class LastOccurence {
    public static int lastOccur(int arr[], int tar, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccur(arr, tar, i + 1);
        if (isFound == -1 && arr[i] == tar) {
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 2 };
        int tar = 1;
        int i = 0;
        int res = lastOccur(arr, tar, i);
        System.out.println(res);
    }
}
