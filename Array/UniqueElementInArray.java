public class UniqueElementInArray {
    public static void main(String[] args) {
        int nums[] = { 20, 10, 50, 50, 30, 20, 10 };

        System.out.println(uniqueElementInArray(nums));
    }

    // BruteForce
    // public static boolean uniqueElementInArray(int nums[]) {
    // for (int i = 0; i < nums.length; i++) {
    // for (int j = i + 1; j < nums.length; j++) {
    // if (nums[i] == nums[j]) {
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    public static boolean uniqueElementInArray(int nums[]) { // Effective
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[0] == nums[i]) {
                return true;
            }
        }
        return false;
    }
}
