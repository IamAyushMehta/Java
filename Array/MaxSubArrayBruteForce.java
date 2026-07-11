public class MaxSubArrayBruteForce {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };

        bruteForce(arr);
    }

    public static void bruteForce(int arr[]) {
        int currMax = 0;
        int totalMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currMax = 0;
                for (int k = i; k <= j; k++) {
                    currMax += arr[k];
                }
                System.out.println(currMax);
                if (totalMax < currMax) {
                    totalMax = currMax;
                }
            }
        }
        System.out.println("Max sum " + totalMax);
    }
}