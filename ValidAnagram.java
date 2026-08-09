import java.util.Arrays;

public class ValidAnagram {
    public static boolean validAnagram(String s, String t) {
        char arr1[] = s.toCharArray();
        Arrays.sort(arr1);
        String s1 = new String(arr1);

        char arr2[] = t.toCharArray();
        Arrays.sort(arr2);
        String s2 = new String(arr2);

        if (s1.equals(s2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "heart";
        String t = "earth";

        System.out.println(validAnagram(s, t));
    }
}
