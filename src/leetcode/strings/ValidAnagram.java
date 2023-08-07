package leetcode.strings;

public class ValidAnagram {

    public static void main(String[] args) {

    String first = "tea";
    String second = "eat ";

    boolean isAnagram = isAnagram(first,second);

        System.out.println(isAnagram);
    }

    public static boolean isAnagram(String first, String second){
        if(first.length() != second.length()){
            return false;
        }

        int [] counter = new int[26];
        for (int i = 0; i < first.length()-1; i++) {
            counter[first.charAt(i) - 'a']++;
        }
        for (int i = 0; i < second.length()-1; i++) {
            counter[second.charAt(i) - 'a']--;
            if (counter[second.charAt(i) - 'a'] < 0){
                return false;
            }
        }

        return true;
    }
}
