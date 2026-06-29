public class LargestNumInArray {
    public static void main(String[] args) {
        int num[] = { 2, 6, -16, 7, 5 };

        System.out.println("Largest : " + largestNumInArray(num));
        System.out.println("Smallest : " + smallestNumInArray(num));
    }

    public static int largestNumInArray(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int smallestNumInArray(int arr[]) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
