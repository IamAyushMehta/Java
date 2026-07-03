public class FindNumInArray{
    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        // int nums[] = {4, 5, 6, 7, 0, 1, 2};
        // int target = 3;

        // int nums[] = {1};
        // int target = 0;


        System.out.println(findNumInArray(nums, target));
    }

    public static int findNumInArray(int nums[], int target) {
        for(int i=0; i<nums.length; i++) {
            if(target == nums[i]) {
                return i;
            }
        }
        return -1;
    }
}