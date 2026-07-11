public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        str.append(" ");
        str.append("World");

        System.out.println(str.toString());
    }
}