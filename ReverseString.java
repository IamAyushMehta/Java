public class ReverseString {
    public static void main(String[] args) {
        String s = "naman";
        reverseString(s);
    }

    public static void reverseString(String s) {
        String str = "";
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            str = ch + str;
        }
        System.out.println(str);
    }
}
