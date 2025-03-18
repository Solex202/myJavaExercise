package leetcode.arrays;

public class LengthOfLastWordInAString {

    public static void main(String[] args) {
//        String word = "";
//        int length = lengthOfLastWord2(word);
//        System.out.println(length);
    }

    public int lengthOfLastWord(String s){
        int right = s.length() -1 ;
        while (right >= 0 && s.charAt(right) == ' '){
            right --;
        }

        int left = right;
        while (left >= 0 && s.charAt(left) != ' '){
            left--;
        }

        return right - left;
    }

    public int lengthOfLastWord2(String word){
        if (word == null || word.isEmpty()){
            return 0;
        }
        String [] splitWord= word.split("\\s+");

//        if(splitWord.length == 0){
//            return 0;
//        }
        String lastWord = splitWord[splitWord.length - 1];

        return lastWord.length();
    }
}
