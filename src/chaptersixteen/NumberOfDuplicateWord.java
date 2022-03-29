package chaptersixteen;

import java.util.*;

public class NumberOfDuplicateWord {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter a sentence");
        int result = returnNumberOfDuplicate("the boy is a boy is a boy from from go go to to");
        System.out.println(result);
    }

    public  static int returnNumberOfDuplicate(String sentence) {
        sentence = sentence.toLowerCase();
        String [] array = sentence.split(" ");
//        Set<String> setOfWords = new HashSet<String>(List.of(array));
//        return array.length - setOfWords.size();
        Map<String, Integer> wordCount = new Hashtable<>();

        for (String word : array) {
            if(wordCount.containsKey(word)){
                int count = wordCount.get(word);
                wordCount.put(word, count +1);
            }
            else{
                wordCount.put(word,1);
            }
        }

        int countOfDuplicate = 0;

        for (String key: wordCount.keySet()) {
            if (wordCount.get(key) > 1){
                countOfDuplicate++;
            }

        }
        return countOfDuplicate;
    }
}

//        for (String key: wordCount.keySet()) {
//                if (wordCount.get(key) > 1){
//                countOfDuplicate++;
//                }
//
//                }
//                return countOfDuplicate;