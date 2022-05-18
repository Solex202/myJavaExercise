package classwork.semicolon;

import java.util.ArrayList;
import java.util.List;

public class IteratingArraylist {
    public static void main(String[] args) {

        List<String> lists = new ArrayList<>();
        lists.add("food");
        lists.add("drink");
        lists.add("cloth");
        lists.add("bag");

        System.out.println(lists);

        for (String item : lists) {

            System.out.println(item);
        }
    }
}
