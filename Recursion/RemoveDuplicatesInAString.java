public class RemoveDuplicatesInAString {
    public static void rmDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            rmDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            rmDuplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        int idx = 0;
        rmDuplicates(str, idx, new StringBuilder(""), new boolean[26]);
    }
}