import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String original = "nagaram";

        // 1. Convert string to char array
        char[] chars = original.toCharArray();

        // 2. Sort the array using the built-in dual-pivot Quicksort
        Arrays.sort(chars);

        // 3. Convert the sorted char array back to a String
        String sorted = new String(chars);

        System.out.println("Sorted: " + sorted);
        // Output: agimmnooprr
    }
}
