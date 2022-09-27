package chapterFourteen;

import java.time.LocalDateTime;

public class SearchingString {
    public static void main(String[] args) {
//        searchingStrings("Men are men", "e");

        LocalDateTime today = LocalDateTime.now();
        System.out.println(today.getDayOfWeek() + ", " + today.getMonth());
        System.out.println(today);
        LocalDateTime threeMonths = LocalDateTime.of(today.getYear(), today.getMonth().getValue()+3, today.getDayOfMonth(),today.getHour(), today.getMinute(), today.getSecond());
        System.out.println(threeMonths.getDayOfWeek() + ", " + threeMonths.getMonth());
        System.out.println(threeMonths);
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
