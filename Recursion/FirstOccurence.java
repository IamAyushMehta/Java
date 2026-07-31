public class FirstOccurence {
    public static int firstOccurence(int arr[], int i, int tar) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == tar) {
            return i;
        }

        return firstOccurence(arr, i + 1, tar);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int tar = 56;
        int res = firstOccurence(arr, 0, tar);

        if (res == -1) {
            System.out.println(tar + " Not found");
        } else {
            System.out.println(tar + " Found at index " + res);
        }
    }
}
