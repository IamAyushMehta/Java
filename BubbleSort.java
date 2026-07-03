public class BubbleSort {
    public static void main(String[] args) {
        // int nums[] = { 5, 4, 1, 3, 2 };
        int nums[] = { 1, 2, 3, 4, 5 };
        bubbleSort(nums);
        printArr(nums);
    }

    public static void bubbleSort(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }

    public static void printArr(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
