package chapterFourteen;

import java.util.Scanner;

public class CreatingThreeLetterString {

    public static void main(String[] args) {
        String word = "lolo";


        method(word);
    }

    private static void method(String words) {
        for (int i = 0; i < words.length(); i++) {
            for (int j = i; j < words.length(); j++) {
                for (int k = j; k < words.length(); k++) {
                    if(i == j || i == k || j == k) continue;
                    System.out.printf("%c%c%c\n", words.charAt(i), words.charAt(j), words.charAt(k));
                }
            }
        }
    }


//    for (int i = 0; i < words.length(); i++) {
//        for (int j = 0; j < words.length(); j++) {
//            for (int k = 0; k < words.length(); k++) {
//                if(i == j || i == k || j == k) continue;
//                System.out.printf("%c%c%c\n",words.charAt(i),words.charAt(j),words.charAt(k));
//            }
//        }
//    }
}
