import java.util.Arrays;

public class Solution {
    public static void stringSort(String s) {
        char arr[] = s.toCharArray();

        Arrays.sort(arr);

        String str = new String(arr);

        System.err.println(str);
    }

    public static void main(String[] args) {
        String s = "ayush";

        stringSort(s);
    }
}