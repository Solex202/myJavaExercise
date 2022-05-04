package chapterFourteen;

public class SearchingString {
    public static void main(String[] args) {
        searchingStrings("Men are men", "e");
    }

    private static void searchingStrings(String sentence, String _char) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {

            if (String.valueOf(sentence.charAt(i)).equals(_char)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
