public class UniqueElementInArray {
    public static void main(String[] args) {
        int nums[] = { 20, 10, 50, 50, 30, 20, 10 };

        System.out.println(uniqueElementInArray(nums));
    }

    public static int uniqueElementInArray(int nums[]) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
