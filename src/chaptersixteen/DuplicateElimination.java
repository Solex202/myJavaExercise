package chaptersixteen;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElimination {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<String> set = duplicateElimination(scan);
        System.out.println(set);
    }

    private static Set<String> duplicateElimination(Scanner scan) {
        System.out.println("enter your name or ctrl-D to exit");
        Set<String> names = new HashSet<>();

        while( scan.hasNext()){
            names.add(scan.next().toLowerCase());
            System.out.println("enter your name or ctrl-D to exit");

        }
        return names;
    }
}
