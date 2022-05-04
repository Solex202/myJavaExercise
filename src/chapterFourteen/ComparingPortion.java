package chapterFourteen;

import java.util.Scanner;

public class ComparingPortion {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string");
        String s1 = scanner.nextLine();

        System.out.println("enter another string");
        String s2 = scanner.nextLine();

//        int check = s1.regionMatches(0,s2,0,3);
        regionMethod(s1, s2);
    }

    public static void regionMethod(String s1, String s2) {
        boolean check = s1.regionMatches(0, s2,0,5);
        System.out.println(check);
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("s1 equals s2");
        }
        else{
            System.out.println("not equal");
        }
    }

}
