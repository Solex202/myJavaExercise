package chaptersixteen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class CountingLetter {


        static void characterCount(String inputString)
        {
            // Creating a HashMap containing char
            // as a key and occurrences as  a value
            Map<Character, Integer> charCountMap = new HashMap<>();

            // Converting given string to char array

            char[] strArray = inputString.toCharArray();

            // checking each char of strArray
            for (char c : strArray) {
                if(c == ' '){
                    continue;
                }
                if (charCountMap.containsKey(c)) {

                    // If char is present in charCountMap,
                    // incrementing it's count by 1
                    charCountMap.put(c, charCountMap.get(c) + 1);
                }
                else {

                    // If char is not present in charCountMap,
                    // putting this char to charCountMap with 1 as it's value
                    charCountMap.put(c, 1);
                }
            }

            // Printing the charCountMap
            for (Map.Entry entry : charCountMap.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

        // Driver Code
        public static void main(String[] args)
        {

            String str = "hello there";
            characterCount(str);
//            System.out.println(IntStream.rangeClosed(1,10)
//                    .summaryStatistics());
//            System.out.println(IntStream.rangeClosed(1,10).map(numbers -> numbers * 2).sum());
            IntStream.iterate(1,x -> x + 1).limit(10).forEach(System.out::println);
      }
    }

