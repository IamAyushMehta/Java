public class SecondLargest {
    public static int secondLargest(int arr[]) {
        int largest = arr[0];
        int secLargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secLargest && largest > arr[i]) {
                secLargest = arr[i];
            } else {
                largest = arr[i];
            }
        }
        return secLargest;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 7, 7, 5 };
        System.out.println(secondLargest(arr));
    }
}
