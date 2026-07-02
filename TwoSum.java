public class TwoSum {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 9;

        int result[] = twoSum(arr, target);

        if (result[0] == -1 && result[1] == -1) {
            System.out.println("No pair found");
        } else {
            System.out.println(result[0] + " " + result[1]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int i, j;
        for (i = 0; i < nums.length; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
