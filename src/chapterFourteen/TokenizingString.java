package chapterFourteen;

public class TokenizingString {
    public static void main(String[] args) {

        upperAndLower("I aM a GoOd BOy");
    }

    public static void upperAndLower(String letter){
        String result = letter.toLowerCase();
        String result2 = letter.toUpperCase();
        System.out.println(result);
        System.out.println(result2);
    }
}