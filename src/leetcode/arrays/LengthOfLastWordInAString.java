package leetcode.arrays;

public class LengthOfLastWordInAString {

    public static void main(String[] args) {
        String word = "my name is deola";
        int length = lengthOfLastWord(word);
        System.out.println(length);
    }

    public static int lengthOfLastWord(String s){
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
}
