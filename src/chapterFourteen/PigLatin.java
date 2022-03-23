package chapterFourteen;

import java.util.Scanner;



public class PigLatin {

    public String printLatinWord(String word){
        StringBuilder result = new StringBuilder(word);
        Character character = word.charAt(0);
        result.insert(result.length(),character);
        result.append("ay");
        return result.substring(1);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] words = scanner.nextLine().split("");

    }
}
