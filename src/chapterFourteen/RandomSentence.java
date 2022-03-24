package chapterFourteen;

import java.security.SecureRandom;

public class RandomSentence {
//    14.5 (Random Sentences) Write an application that uses random-number generation to create
//    sentences. Use four arrays of strings called article, noun, verb and preposition. Create a sentence
//    by selecting a word at random from each array in the following order: article, noun, verb, preposition, article and noun. As each word is picked, concatenate it to the previous words in the sentence.
//    The words should be separated by spaces. When the final sentence is output, it should start with a
//    capital letter and end with a period. The application should generate and display 20 sentences.
//    The article array should contain the articles "the", "a", "one", "some" and "any"; the noun
//    array should contain the nouns "boy", "girl", "dog", "town" and "car"; the verb array should contain the verbs "drove", "jumped", "ran", "walked" and "skipped"; the preposition array should
//    contain the prepositions "to", "from", "over", "under" and "on".

    public static void sentenceApp() {
        SecureRandom randomSentence = new SecureRandom();

        String[] article = {"the", "a", "one", "some", "any"};
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] preposition = {"to", "from", "over", "under", "on"};

        int j = 0;
        while (j < 5) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                int theRandom = randomSentence.nextInt(5);
                if (i == 0) {
                    String chr = article[theRandom];
                    String _char = chr.substring(0, 1).toUpperCase();
                    String remainingPart = chr.substring(1);
                    String newWord = _char + remainingPart;

                    sb.append(newWord).append(" ");

                }
                if (i == 1) {
                    sb.append(noun[theRandom]).append(" ");
                }
                if (i == 2) {
                    sb.append(verb[theRandom]).append(" ");
                }
                if (i == 3) {
                    sb.append(preposition[theRandom]).append(" ");
                }
                if (i == 4) {
                    sb.append(article[theRandom]).append(" ");
                }
                if (i == 5) {
                    sb.append(noun[theRandom]).append(".");
                }

            }
            System.out.println(sb);
            j++;
        }
    }

    public static void main(String[] args) {

        sentenceApp();
    }
}
