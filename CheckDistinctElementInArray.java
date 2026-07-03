public class CheckDistinctElementInArray {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1 };
        // int nums[] = {1, 2, 3, 4};
        // int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println(checkDistinctElementInArray(nums));
    }
    // BruteForce
    // public static boolean checkDistinctElementInArray(int nums[]) {
    // for(int i=0; i<nums.length; i++) {
    // for(int j=i+1; j<nums.length; j++) {
    // if(nums[i] == nums[j]) {
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    // Effective Solution
    public static boolean checkDistinctElementInArray(int nums[]) {
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[0] == nums[i]) {
                return true;
            }
        }
        return false;
    }

}
