public class LinearSearch {
    public static void main(String[] args) {
        // String str[] = { "dosa", "coke", "burger", "pizza", "biryani" };
        // String target = "pizza";

        int arr[] = { 1, 3, 5, 7, 8 };
        int tar = 7, index;

        // index = linearSearchForString(str, target);
        index = linearSearchForNumber(arr, tar);

        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found at index : " + index);
        }
    }

    public static int linearSearchForNumber(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // public static int linearSearchForString(String arr[], String target) {
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == target) {
    // return i;
    // }
    // }
    // return -1;
    // }
}
