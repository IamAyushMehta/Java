import java.util.*;

public class arrlist {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);

        lst.get(4);
        lst.remove(0);
        lst.set(0, 1);
        lst.add(1, 2);
        System.out.println(lst);
    }
}